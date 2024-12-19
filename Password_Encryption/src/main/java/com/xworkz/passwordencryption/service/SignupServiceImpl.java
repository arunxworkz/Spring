package com.xworkz.passwordencryption.service;

import com.xworkz.passwordencryption.dto.SignupDTO;
import org.springframework.stereotype.Service;

@Service
public class SignupServiceImpl implements  SignupService{
    @Override
    public boolean signUp(SignupDTO dto) {
        System.out.println("running signup in SignupServiceImpl");
        //entity vs dto
        // Validation
        //Ajax
        // Dependency Injection
        // IOC
        // Modules
        return true;
    }
}
