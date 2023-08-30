package com.isyeon.listmyhome.domain.user.repository;

import com.isyeon.listmyhome.domain.user.entity.Users;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {

    //@EntityGraph : 해당 쿼리 수행 시 Lazy 조회가 아닌 Eager 조회를 수행
    @EntityGraph(attributePaths = "authorities")
    Optional<Users> findOneWithAuthoritiesByUserId(String userId);

    Users findByUserId(String userId);
}
