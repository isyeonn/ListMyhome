package com.isyeon.listmyhome.domain.storage.food.repository;

import com.isyeon.listmyhome.common.DrinkType;
import com.isyeon.listmyhome.domain.storage.food.entity.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DrinkRepository extends JpaRepository<Drink, Long> {

    public List<Drink> findByDrinkType(DrinkType drinkType);
}
