package com.example.nsshop.domain.user.dto;

import lombok.Data;

@Data
public class SignInRequest {
    private String username;
    private String password;
}
