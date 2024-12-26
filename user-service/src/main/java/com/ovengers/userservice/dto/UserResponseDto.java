package com.ovengers.userservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {
    private String id;
    private String email;
    private String name;
    private String affid;
}