package com.thirautech.amingwiki.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String userId;
    private String password;
    private String deptId;
    private String userName;
    private String usable;
    private String auth;
}
