package com.isyeon.listmyhome.domain.storage.food.dto;

import com.isyeon.listmyhome.common.SnackType;
import lombok.Getter;

@Getter
public class FindSnackResponse {

    private Long id;

    private SnackType snackType;

    private String name;

    private String comment;

}
