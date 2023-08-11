package com.isyeon.listmyhome.domain.storage.cloth.controller;

import com.isyeon.listmyhome.common.SEASON;
import com.isyeon.listmyhome.domain.storage.cloth.dto.FindClothResponse;
import com.isyeon.listmyhome.domain.storage.cloth.service.ClothService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 옷장의 아이템 관련 재고 관리
 */
@Tag(name = "Cloths", description = "옷장의 아이템 관련 재고 관리")
@RestController
@RequestMapping("/cloth")
@RequiredArgsConstructor
public class ClothController {

    private final ClothService clothService;

    //옷장 전체 아이템 조회
    @Operation(summary = "모든 옷장 조회", description = "옷장의 옷 모두 출력")
    @GetMapping("/all")
    public List<FindClothResponse> getAllCloth() {
        return clothService.findAllCloth();
    }

    //옷장 현재 계절 조회
    @Operation(summary = "계절 별 옷장 조회", description = "옷장의 옷 중 검색 계절 별 내역 출력")
    @Parameter(name = "season", description = "계절정보")
    @GetMapping("/season")
    public List<FindClothResponse> getCloth(@RequestParam SEASON season) {
        return clothService.findSeosonCloth(season);
    }

    //옷장 새로운 옷 등록

    //옷장 빨랫감 추가

    //아이템 구매

    //아이템 삭제
}
