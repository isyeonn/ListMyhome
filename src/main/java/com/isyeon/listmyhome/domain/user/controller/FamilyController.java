package com.isyeon.listmyhome.domain.user.controller;


import com.isyeon.listmyhome.domain.user.dto.FindFamilyResponse;
import com.isyeon.listmyhome.domain.user.service.FamilyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 화원정보에 들어가는 가족정보
 */
@Tag(name = "Family", description = "가족 정보 관리")
@RestController
@RequestMapping("/family")
@RequiredArgsConstructor
public class FamilyController {

    private final FamilyService familyService;

    //가족 전채 조회하기
    @Operation(summary = "가족 정보 모두 조회", description = "등록된 모든 가족 정보 조회")
    @GetMapping("/all")
    public List<FindFamilyResponse> getAllFamily() {
        return familyService.findAllFamily();
    }

    //가족 조회하기
    @Operation(summary = "가족 정보 선택 조회", description = "검색한 가족 정보 조회")
    @Parameter(name = "id", description = "family id")
    @GetMapping("/{id}")
    public FindFamilyResponse getFamily(@PathVariable Long id) {
        return familyService.findFamilyById(id);
    }

    //기족 생성하기


}
