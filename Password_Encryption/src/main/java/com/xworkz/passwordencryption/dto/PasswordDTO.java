package com.xworkz.passwordencryption.dto;


import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
public class PasswordDTO {

    int id;

    String name;
    String email;
    String password;
    String confirmPassword;
}
