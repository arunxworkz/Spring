package com.xworkz.passwordencryption.controller;

import com.xworkz.passwordencryption.dto.PasswordDTO;
import com.xworkz.passwordencryption.dto.SignupDTO;
import com.xworkz.passwordencryption.service.PasswordService;
import com.xworkz.passwordencryption.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SignupController {


//    @Autowired//to get ref of the Object
//    private SignupService signupService;
//
//    @PostMapping("/signup")
//    public String onSignup(SignupDTO dto)
//    {
//        System.out.println("running onSignUp in SignupController");
//        System.out.println("before return to signup.jsp");
//        boolean success=this.signupService.signUp(dto);
//        System.out.println("success from service :"+success);
//        return "signup.jsp";
//    }


    public SignupController(){
        System.out.println("This is controller");
    }

    @Autowired
    PasswordService passwordService;

    @PostMapping("/signup")
    public String SignUpController(PasswordDTO dto)
    {
        System.out.println("Dto is:" +dto);
        String string = passwordService.validateSave(dto);
        if(string.contains("successfully")) {
            return "login";
        }else{
            return "signup";
        }
    }

    @PostMapping("/logIn")
    public String get(String email, String password, Model model){
        System.out.println("get method in contorller");

        String string = passwordService.getNameByEmailAndPassword(email, password);


        if(!string.equals("Invalid email or password")){
            model.addAttribute("userName", string);
            return "Success";
        }else{
        return "login";
        }
    }

    @Bean
    public PasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder();
    }


    @PostMapping("/details")
    public String getDetails(String email, Model model){

        System.out.println("This is getting details from controller");

        PasswordDTO dto = passwordService.getUSerDetails(email);
        System.out.println(dto);
        model.addAttribute("gotDetails", dto);

        return "Details";
    }
}
