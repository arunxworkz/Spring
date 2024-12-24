package com.xworkz.xworkz_common_module_Arun.dto;

import com.xworkz.xworkz_common_module_Arun.entity.SignUpEntity;
import lombok.Data;

@Data
public class ResetDTO {

    SignUpEntity signUpEntity;
    String newPasswrod;
    String confirmPassword;



}
