package com.isyeon.listmyhome.domain.storage.cloth.repository;

import com.isyeon.listmyhome.common.SEASON;
import com.isyeon.listmyhome.domain.storage.cloth.entity.Cloth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClothRepository extends JpaRepository<Cloth, Long> {

    public List<Cloth> findBySeason(SEASON season);
}
