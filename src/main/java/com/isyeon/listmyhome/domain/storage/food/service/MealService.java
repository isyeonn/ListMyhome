package com.isyeon.listmyhome.domain.storage.food.service;

import com.isyeon.listmyhome.common.MealType;
import com.isyeon.listmyhome.domain.storage.food.dto.FindMealResponse;
import com.isyeon.listmyhome.domain.storage.food.entity.Meal;
import com.isyeon.listmyhome.domain.storage.food.repository.MealRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MealService {

    private MealRepository mealRepository;

    private final ModelMapper modelMapper;

    /*
    모두 조회
     */
    public List<FindMealResponse> findAllMeal(){
        List<Meal> mealList = mealRepository.findAll();
        List<FindMealResponse> responseList =
                mealList.stream().map(p -> modelMapper.map(p, FindMealResponse.class))
                        .collect(Collectors.toList());
        return responseList;
    }

    /*
    meal_type으로 조회
     */
    public List<FindMealResponse> findAllMeal(MealType mealType){
        List<Meal> mealList = mealRepository.findByMeal_type(mealType);
        List<FindMealResponse> responseList =
                mealList.stream().map(p -> modelMapper.map(p, FindMealResponse.class))
                        .collect(Collectors.toList());
        return responseList;
    }

}
