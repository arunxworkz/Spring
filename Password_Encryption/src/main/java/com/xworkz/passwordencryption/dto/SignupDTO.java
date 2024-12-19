package com.xworkz.passwordencryption.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
public class SignupDTO {

    private String name;
    private String email;
    private String password;
    private String confirmPassword;
}
