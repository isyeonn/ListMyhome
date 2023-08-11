package com.isyeon.listmyhome.domain.storage.food.controller;

import com.isyeon.listmyhome.common.DrinkType;
import com.isyeon.listmyhome.domain.storage.food.dto.FindDrinkResponse;
import com.isyeon.listmyhome.domain.storage.food.service.DrinkService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 음식 - 음료 재고 정리
 */
@Tag(name = "Drinks", description = "음료 재고 관리")
@RestController
@RequestMapping("/drink")
@RequiredArgsConstructor
public class DrinkController {

    private final DrinkService drinkService;

    //현재 재고 모두 조회
    @GetMapping("/all")
    @ResponseBody
    public List<FindDrinkResponse> findAllDrink(){
        return drinkService.findAllDrink();
    }

    //현재 재고 타입별 조회
    @GetMapping("/type")
    @ResponseBody
    public List<FindDrinkResponse> findDrink(DrinkType drinkType){
        return drinkService.findAllDrink(drinkType);
    }

    //신규 등록

    //상태 변경

    //삭제
}
