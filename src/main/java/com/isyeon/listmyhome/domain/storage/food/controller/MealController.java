package com.isyeon.listmyhome.domain.storage.food.controller;

import com.isyeon.listmyhome.common.MealType;
import com.isyeon.listmyhome.domain.storage.food.dto.FindMealResponse;
import com.isyeon.listmyhome.domain.storage.food.service.MealService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 2022.09.04 이승연 최초작성
 * 음식 - 식사 관련 재고 관리
 */

@Tag(name = "Meals", description = "식사 관련 재고 관리")
@RestController
@RequestMapping("/meal")
@RequiredArgsConstructor
public class MealController {

	private final MealService mealService;

	//현재 재고 모두 조회
	@Operation(summary = "현재 재고 모두 조회", description = "식사 관련 재료 모두 출력")
	@GetMapping("/all")
    public List<FindMealResponse> getAllMeals() {
		return mealService.findAllMeal();
    }

	//현재 재고 타입별 조회
	@Operation(summary = "타입 별 현재 재고 조회", description = "타입 별 식사 재료 출력")
	@GetMapping("/type")
	public List<FindMealResponse> PostTest(MealType mealType) {
		return mealService.findAllMeal(mealType);
	}

	//신규 등록
	//@PostMapping("/post")

	//상태 변경

	//삭제
	
	
	

}