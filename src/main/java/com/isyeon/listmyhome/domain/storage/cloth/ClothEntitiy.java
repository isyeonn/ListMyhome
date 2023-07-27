package com.isyeon.listmyhome.domain.storage.cloth;

import com.isyeon.listmyhome.common.SEASON;
import lombok.Builder;

import javax.persistence.*;

@Entity
@Table(name = "tbl_cloth")
public class ClothEntitiy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    private SEASON season;

    private String color;

    private boolean exist = false;

    //옷 타입
    private String type;

    private int amt = 1;

//    @Builder
//    public ClothEntitiy(String name, SEASON season, String color,
//                        boolean exist, String type, int amt) {
//        this.name = name;
//        this.season = season;
//    }

}
