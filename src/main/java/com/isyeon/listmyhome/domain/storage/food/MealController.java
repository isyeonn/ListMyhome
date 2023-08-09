package com.isyeon.listmyhome.domain.storage.food;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2022.09.04 이승연 최초작성
 * 음식 - 식사 관련 재고 관리
 */

@Tag(name = "Meals", description = "식사 관련 재고 관리")
@RestController
@RequestMapping("/meal")
public class MealController {


	//현재 재고 모두 조회
	@Operation(summary = "현재 재고 모두 조회", description = "식사 관련 재료 모두 출력")
	@GetMapping("/getMeals")
    public String get() {
		return null;
    }


	//현재 재고 타입별 조회
	@PostMapping("/post")
	public String PostTest(@RequestBody String msg) {
		return null;
	}

	//신규 등록

	//상태 변경

	//삭제
	
	
	

}