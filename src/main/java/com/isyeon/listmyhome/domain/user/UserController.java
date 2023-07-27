package com.isyeon.listmyhome.domain.user;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2023.07.28 이승연 최초작성
 * 서비스를 사용하는 회원 정보 관리
 */
@Tag(name = "Users", description = "회원 정보 관리")
@RestController
@RequestMapping("/user")
public class UserController {

    //회원 조회
    @GetMapping("/getUser")
    public void getUser() {

    }

    //회원 등록

    //회원 정보 수정

    //회원 사용여부 변경

}
