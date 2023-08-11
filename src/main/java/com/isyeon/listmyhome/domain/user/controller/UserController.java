package com.isyeon.listmyhome.domain.user.controller;

import com.isyeon.listmyhome.domain.user.service.UserService;
import com.isyeon.listmyhome.domain.user.dto.FindUserResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 2023.07.28 이승연 최초작성
 * 서비스를 사용하는 회원 정보 관리
 */
@Tag(name = "Users", description = "회원 정보 관리")
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    //회원 조회
    @Operation(summary = "회원 조회", description = "검색한 회원 정보 조회")
    @Parameter(name = "id", description = "user id")
    @GetMapping("/{id}")
    public FindUserResponse getUser(@PathVariable Long id) {
        return userService.findUserById(id);
    }

    //회원 등록

    //회원 정보 수정

    //회원 사용여부 변경

}
