package com.isyeon.listmyhome.domain.user.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class FindUserResponse {

    private int id; //PK

    private String userName; //사용자이름

    private int age; //나이

    private LocalDateTime createdDate; //생성일

    private LocalDateTime modifiedDate; //수정일


}
