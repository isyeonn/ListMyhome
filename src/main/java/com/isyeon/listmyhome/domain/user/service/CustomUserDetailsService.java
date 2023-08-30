package com.isyeon.listmyhome.domain.user.service;

import com.isyeon.listmyhome.domain.user.entity.Users;
import com.isyeon.listmyhome.domain.user.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Component("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(final String username) {

        System.out.println("userId:"+username);
        UserDetails ret;
        ret = userRepository.findOneWithAuthoritiesByUserId(username)
                .map(user -> createUser(username, user))
                .orElseThrow(() -> new UsernameNotFoundException(username + " -> 데이터베이스에서 찾을 수 없습니다."));
        return ret;
    }

    private User createUser(String username, Users users) {
       if( users.getUseFlag() != 'Y')  {
           throw new RuntimeException(username + " -> 활성화되어 있지 않습니다.");
       }
       List<GrantedAuthority> grantedAuthorities = users.getAuthorities().stream()
               .map(authority -> new SimpleGrantedAuthority(authority.getAuthorityName()))
               .collect(Collectors.toList());
       return new User(users.getUserName(),
               users.getPassword(),
               grantedAuthorities);
    }
}
