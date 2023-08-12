package com.isyeon.listmyhome.domain.storage.food.entity;

import com.isyeon.listmyhome.common.BaseTime;
import com.isyeon.listmyhome.common.DrinkType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "drink")
public class Drink extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  //PK

    @Column(length = 7, nullable = false)
    @Enumerated(EnumType.STRING)
    private DrinkType drinkType; //종류 (예:WATER)

    @Column(length = 20)
    private String detailType; //소분류 (예:생수)

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 50)
    private String comment; //설명 (예:집들이 선물)

    @Column
    private int calorie; //열량

    private LocalDateTime expireDate; //유통기한

    private String unit; // 단위 (예:병, 캔)

    @ColumnDefault("100")
    @Column(nullable = false)
    private int amount; // 남은 양 (백분위)

    @ColumnDefault("0")
    private double alcolContent; //알콜 도수

    private String status; //상태 (예: 상온, expired)


}
