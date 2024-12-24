package com.xworkz.xworkz_common_module_Arun.controller;
import antlr.PreservingFileWriter;
import com.xworkz.xworkz_common_module_Arun.dto.SignUpDTO;
import com.xworkz.xworkz_common_module_Arun.entity.SignUpEntity;
import com.xworkz.xworkz_common_module_Arun.repository.SignUpRepo;
import com.xworkz.xworkz_common_module_Arun.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class XworkzContorller {

    @Autowired
    private SignUpRepo signUpRepo;

    @Autowired
    private SignupService signupService;

    public XworkzContorller() {
        System.out.println("This is Contorller");
    }
    private BCryptPasswordEncoder bcEncoder = new BCryptPasswordEncoder();
    SignUpEntity entity = new SignUpEntity();

    @PostMapping("/register")
    public String onSave(SignUpDTO dto) {
        System.out.println("Excutng the save method");
        boolean check = signupService.onSave(dto);
        System.out.println(check);
        if (check) {
            System.out.println("Data eb=neterd");
            return "Success";
        } else {
            System.out.println("Data not entered");
            return null;
        }
    }

    @PostMapping("/logIn")
    public String onSignIn(@RequestParam  String email, @RequestParam String password, Model model) {
        System.out.println(email + "    "+password);
        SignUpEntity str = signupService.onSignIn(email, password);
        System.out.println("User name is: " + str);
        System.out.println("in controller.." + str);
        if(str!=null){
            if(str.getLogin_count()==-1){
                return "PasswordrReset";
            }else if(str.getLogin_count() == 0){
                return "Success";
            }
        }
        return "PasswordReset";
    }

    @PostMapping("/updatePassword")
    public String onChangePassword(@RequestParam String email, @RequestParam String newPassword, @RequestParam String confirmPassword) {
        System.out.println("for update password.." + email);
        if (signupService.onUpdate(email, newPassword, confirmPassword))
            return "Success";
        return "PasswordReset";
    }

//    @PostMapping("/login")
//    public String onAnotherSignIn(String email, String password){
//        System.out.println("This is from onAnotherSignIn method of controller: "+email);
//        String userName = signupService.anotherSignIn(email, password);
//        System.out.println("Email fron onAnotherSignIN from: "+userName);
//        if(userName!=null){
//            return "Success";
//        }
//        return "Failure";
//    }
}


