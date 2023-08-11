package com.isyeon.listmyhome.domain.storage.food.controller;

import com.isyeon.listmyhome.common.SnackType;
import com.isyeon.listmyhome.domain.storage.food.dto.FindSnackResponse;
import com.isyeon.listmyhome.domain.storage.food.service.SnackService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 음식 - 간식 재고 정리
 */
@Tag(name = "Snacks", description = "간식 재고 정리")
@RestController
@RequestMapping("/snack")
@RequiredArgsConstructor
public class SnackController {

    private final SnackService snackService;

    //현재 재고 모두 조회
    @GetMapping("/all")
    @ResponseBody
    public List<FindSnackResponse> findAllSnack(){
        return snackService.findAllSnack();
    }

    //현재 재고 타입별 조회
    @GetMapping("/type")
    @ResponseBody
    public List<FindSnackResponse> findDrink(SnackType snackType){
        return snackService.findAllSnack(snackType);
    }

    //신규 등록

    //상태 변경

    //삭제
}
