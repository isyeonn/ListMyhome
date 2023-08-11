package com.isyeon.listmyhome.domain.user.service;

import com.isyeon.listmyhome.domain.user.dto.FindUserResponse;
import com.isyeon.listmyhome.domain.user.entity.Users;
import com.isyeon.listmyhome.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor //모든 final 멤버에 대해 생성자를 만들어줌
public class UserService {

    private final UserRepository userRepository;

    private final ModelMapper modelMapper;

    /*
    user_id로 조회
     */
    public FindUserResponse findUserById(Long id){
        Users userInfo = userRepository.getById(id);
        return modelMapper.map(userInfo, FindUserResponse.class);
    }
}
