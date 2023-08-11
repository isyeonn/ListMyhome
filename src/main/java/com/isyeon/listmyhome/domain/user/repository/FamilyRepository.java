package com.isyeon.listmyhome.domain.user.repository;

import com.isyeon.listmyhome.domain.user.entity.Family;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRepository extends JpaRepository<Family, Long> {
}
