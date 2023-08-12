package com.isyeon.listmyhome.domain.storage.cloth.entity;

import com.isyeon.listmyhome.common.BaseTime;
import com.isyeon.listmyhome.common.SEASON;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "cloth")
public class Cloth extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  //PK

    @Column(length = 30, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    @Enumerated(EnumType.STRING)
    private SEASON season;

    private String color;

    private boolean exist = false;

    //옷 타입
    private String type;

    private int amt = 1;

}
