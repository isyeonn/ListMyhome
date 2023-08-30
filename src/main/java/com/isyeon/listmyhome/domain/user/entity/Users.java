package com.isyeon.listmyhome.domain.user.entity;

import com.isyeon.listmyhome.common.BaseTime;
import com.isyeon.listmyhome.common.GENDER;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(name = "user")
public class Users extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  //PK

    @Column(name = "user_id", length = 30, nullable = false)
    private String userId; //사용자 아이디

    @Column(length = 30, nullable = false)
    private String userName; //사용자이름

    @Column(length = 30, nullable = false)
    private String password; //비밀번호

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

    @ManyToMany
    @JoinTable(
            name = "user_authority",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "authority_name")})
    private Set<Authority> authorities;

}
