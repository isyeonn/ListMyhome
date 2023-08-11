package com.isyeon.listmyhome.domain.storage.cloth.dto;

import com.isyeon.listmyhome.common.SEASON;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class FindClothResponse {

    private Long id; //PK

    private String name;

    private SEASON season;

    private String color;

    private boolean exist; //옷장에 있는지 여부

    private String type; //옷 타입

    private int amt = 1;

    private LocalDateTime createdDate;

    private LocalDateTime modifiedDate;


}
