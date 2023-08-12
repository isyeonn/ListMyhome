package com.isyeon.listmyhome.domain.storage.food.entity;

import com.isyeon.listmyhome.common.BaseTime;
import com.isyeon.listmyhome.common.SnackType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "snack")
public class Snack extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  //PK

    @Column(length = 7, nullable = false)
    @Enumerated(EnumType.STRING)
    private SnackType snackType; //종류 (예:CHIP)

    @Column(length = 20, nullable = false)
    private String name;


    @Column(length = 50)
    private String comment; //설명 (예:집들이 선물)

    @Column
    private int calorie; //열량

    private LocalDateTime expireDate; //유통기한

    private String unit; // 단위 (예:봉지)

    @ColumnDefault("100")
    @Column(nullable = false)
    private int amount; // 남은 양 (백분위)

    private String status; //상태 (예: 상온, expired)


}
