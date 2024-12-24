package com.xworkz.xworkz_common_module_Arun.service;

import com.xworkz.xworkz_common_module_Arun.dto.SignInDTO;
import com.xworkz.xworkz_common_module_Arun.dto.SignUpDTO;
import com.xworkz.xworkz_common_module_Arun.entity.SignUpEntity;

public interface SignupService {

    public boolean onSave(SignUpDTO dto);

    public Long countName(String name);

    long countEmail(String email);

    long countPhno(String phNo);

    SignUpEntity onSignIn(String email, String password);
//    Boolean onSignIn(SignInDTO dto);

//    String getDate(String email, String password);

    boolean onUpdate(String email, String newPasssword, String confirmPassword);

//    public String anotherSignIn(String email, String password);

//    boolean saveEmail(String email , String password);

}
