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
    @Column(name = "family_id")
    private Long id;  //PK

    private String familyId; //기족 아이디

    private char useFlag; //사용여부
}
