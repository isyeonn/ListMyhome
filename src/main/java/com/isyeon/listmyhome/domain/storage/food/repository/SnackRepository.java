package com.isyeon.listmyhome.domain.storage.food.repository;

import com.isyeon.listmyhome.common.SnackType;
import com.isyeon.listmyhome.domain.storage.food.entity.Snack;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SnackRepository extends JpaRepository<Snack, Long> {

    public List<Snack> findBySnack_type(SnackType snackType);
}
