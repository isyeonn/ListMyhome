package com.isyeon.listmyhome.domain.user.entity;

import com.isyeon.listmyhome.common.BaseTime;
import com.isyeon.listmyhome.common.GENDER;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "user")
public class Users extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  //PK

    @Column(length = 30, nullable = false)
    private String userId; //사용자 아이디

    @Column(length = 30, nullable = false)
    private String userName; //사용자이름

    @ManyToOne
    @JoinColumn(name = "family_id")
    private Family family; //가족정보

    @Column(length = 1, nullable = false)
    @Enumerated(EnumType.STRING)
    private GENDER gender; //성별

    @Column(nullable = false)
    private int age; //나이

    @Column(length = 1)
    private char useFlag; //사용여부


    @Column(length = 30)
    private String location;


}
