package com.isyeon.listmyhome.domain.user.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

    @NotNull
    @Size(min = 3, max = 30)
    public String userId;

    @NotNull
    @Size(min = 3, max = 30)
    public String password;
}
