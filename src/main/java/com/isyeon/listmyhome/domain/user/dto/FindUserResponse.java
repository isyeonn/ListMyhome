package com.isyeon.listmyhome.domain.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FindUserResponse {

    private int id; //PK

    @NotNull
    @Size(min = 3, max = 30)
    private String userId; //사용자 아이디

    @NotNull
    @Size(min = 3, max = 30)
    private String userName; //사용자이름

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull
    @Size(min = 3, max = 30)
    private String password; //비밀번호

    private int age; //나이

    private LocalDateTime createdDate; //생성일

    private LocalDateTime modifiedDate; //수정일


}
