package com.isyeon.listmyhome.domain.storage.food.dto;

import com.isyeon.listmyhome.common.DrinkType;
import lombok.Getter;

@Getter
public class FindDrinkResponse {

    private Long id;

    private DrinkType drinkType;

    private String detailType;

    private String name;

    private String comment;
}
