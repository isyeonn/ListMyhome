package com.isyeon.listmyhome.domain.storage.cloth.dto;

import com.isyeon.listmyhome.common.SEASON;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Schema(description = "옷장 추가 요청 모델")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ClothRequestDto {

    private String name;

    private SEASON season;

    private String color;

    private boolean exist;

    //옷 타입
    private String type;

    private int amt = 1;


}
