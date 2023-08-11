package com.isyeon.listmyhome.domain.user.entity;

import com.isyeon.listmyhome.common.BaseTime;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "family")
public class Family extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  //PK

    @Column(length = 20)
    private String name; //이름

    private char useFlag; //사용여부
}
