package com.isyeon.listmyhome.domain.storage.food.repository;

import com.isyeon.listmyhome.common.MealType;
import com.isyeon.listmyhome.domain.storage.food.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MealRepository extends JpaRepository<Meal, Long> {

    public List<Meal> findByMealType(MealType mealType);
}
