package com.isyeon.listmyhome.domain.user.repository;

import com.isyeon.listmyhome.domain.user.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
