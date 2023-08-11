package com.isyeon.listmyhome.domain.storage.cloth.entity;

import com.isyeon.listmyhome.common.BaseTime;
import com.isyeon.listmyhome.common.SEASON;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "cloth")
public class Cloth extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  //PK

    @Column(length = 30, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private SEASON season;

    private String color;

    private boolean exist = false;

    //옷 타입
    private String type;

    private int amt = 1;

    @Builder
    public Cloth(String name, SEASON season, String color,
                        boolean exist, String type, int amt) {
        this.name = name;
        this.season = season;
        this.color = color;
        this.exist = exist;
        this.type = type;
        this.amt = amt;
    }

}
