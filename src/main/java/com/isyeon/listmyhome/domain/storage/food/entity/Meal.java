package com.isyeon.listmyhome.domain.storage.food.entity;

import com.isyeon.listmyhome.common.BaseTime;
import com.isyeon.listmyhome.common.MealType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "meal")
public class Meal extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  //PK

    @Column(length = 7, nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private MealType mealType; //종류 (예:SAUCE)

    @Column(length = 20)
    private String detailType; //소분류 (예:마요네즈)

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 50)
    private String comment; //설명 (예:집들이 선물)

    @Column
    private int calorie; //열량

    private LocalDateTime expireDate; //유통기한

    private String unit; // 단위 (예:통)

    @ColumnDefault("100")
    @Column(nullable = false)
    private int amount; // 남은 양 (백분위)

    private String status; //상태 (예: 상온, 냉장, 냉동, expired)


}
