package com.xworkz.xworkz_common_module_Arun.restController;


import com.xworkz.xworkz_common_module_Arun.service.SignupService;
import net.bytebuddy.implementation.bytecode.assign.TypeCasting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;

@RestController
@RequestMapping("/")
public class RestSignUpController {

    @Autowired
    private SignupService signupService;

    public RestSignUpController(){
        System.out.println("This is rest controller");
    }

    @GetMapping(value = "/userNameValue/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onName(@PathVariable String name, Model model) {
        System.out.println("the name is: "+name);
        Long count = this.signupService.countName(name);
        if(count > 0) {
            System.out.println("Exists");
            model.addAttribute("gotName", "Name Exists");
            return "Existssss";
        }
        return "Does not Exists";
    }

    @GetMapping(value = "/checkEmail/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onEmail(@PathVariable String email){
        System.out.println("this is email: "+email);
        long count = this.signupService.countEmail(email);
        if(count > 0){
            System.out.println("Exists");
            return "Exists";
        }
        return "Does Not Exists";
    }


    @GetMapping(value = "/phNovalue/{phNo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onPhno(@PathVariable String phNo){
        System.out.println("This is from restcontroller: "+phNo);
        long count = this.signupService.countPhno(phNo);
        if(count > 0){
            return "Exists";
        }
        return "Does not exists";
    }
}
