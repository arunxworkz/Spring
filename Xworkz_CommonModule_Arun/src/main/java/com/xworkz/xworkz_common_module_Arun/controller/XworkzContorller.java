package com.xworkz.xworkz_common_module_Arun.controller;


import com.xworkz.xworkz_common_module_Arun.configuration.XworkzConfiguration;
import com.xworkz.xworkz_common_module_Arun.dto.SignUpDTO;
import com.xworkz.xworkz_common_module_Arun.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class XworkzContorller {

    @Autowired
    private SignupService signupService;

    public XworkzContorller(){
        System.out.println("This is Contorller");
    }


    @PostMapping("/signup")
    public String onSignUp(SignUpDTO dto){

        System.out.println("This is controller Method");
        System.out.println("This is data from signUP "+dto);

        if(signupService.onSave(dto)) {
            return "Signin";
        }else{
            return "Signup";
        }
    }


}
