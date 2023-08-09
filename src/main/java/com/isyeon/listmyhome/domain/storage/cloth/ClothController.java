package com.isyeon.listmyhome.domain.storage.cloth;

import com.isyeon.listmyhome.common.SEASON;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 옷장의 아이템 관련 재고 관리
 */
@Tag(name = "Cloths", description = "옷장의 아이템 관련 재고 관리")
@RestController
@RequestMapping("/cloth")
public class ClothController {

    //옷장 전체 아이템 조회
    @Operation(summary = "현재 옷장 내역 조회", description = "현재 옷장에 있는 옷들 모두 출력")
    @Parameter(name = "str", description = "옷옷옷")
    @GetMapping("/all")
    public String getCloth(@RequestParam String str) {
        return null;
    }

    //옷장 현재 계절 조회
    @Operation(summary = "현재 옷장 내역 조회", description = "현재 옷장에 있는 옷들 모두 출력")
    @Parameter(name = "str", description = "옷옷옷")
    @GetMapping("/season")
    public String getCloth(@RequestParam SEASON season) {
        return null;
    }

    //옷장 새로운 옷 등록

    //옷장 빨랫감 추가

    //아이템 구매

    //아이템 삭제
}
