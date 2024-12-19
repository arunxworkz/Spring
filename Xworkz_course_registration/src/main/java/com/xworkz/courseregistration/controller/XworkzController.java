package com.xworkz.courseregistration.controller;


import com.xworkz.courseregistration.dto.XworkzDTO;
import com.xworkz.courseregistration.service.XwrokzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class XworkzController {

    public XworkzController(){
        System.out.println("This is controller class");
    }

    @Autowired
    XwrokzService xwrokzService;

    @PostMapping("/getData")
//    public String method(XworkzDTO dto, Model model){
//        System.out.println("The dto is: "+dto);
//
////       String msg =xwrokzService.save(dto);
//       boolean check=xwrokzService.validate(dto);
//       if(check) {
//           String msg =xwrokzService.save(dto);
//           model.addAttribute("Name", msg);
//           model.addAttribute("Age",msg);
//           model.addAttribute("email",msg);
//           model.addAttribute("password",msg);
//           model.addAttribute("phno",msg);
//           return "login";
//       }
//        return "signup";
//    }

    public String method(XworkzDTO dto, Model model) {
        System.out.println("The DTO is: " + dto);

        // Call the validateAndSave method
        String result = xwrokzService.save(dto);

        if (result.contains("successful")) { // Check if validation and save succeeded
            model.addAttribute("Name", dto.getName());
            model.addAttribute("Age", dto.getAge());
            model.addAttribute("Email", dto.getEmail());
            model.addAttribute("Password", dto.getPassword());
            model.addAttribute("Phno", dto.getPhno());
            return "login"; // Redirect to the login page
        } else {
            model.addAttribute("errorMessage", result); // Display the error message
            return "signup"; // Stay on the signup page
        }
    }


//    @PostMapping("/getNameByEmailAndPassword")
//    public String getName(String email, String password,Model model){
//        System.out.println("The data is :"+ email);
////        String name = xwrokzService.getNameByEmailAndPassword(email, password);
//        if("Invalid password".equals(name)){
//            model.addAttribute("errorMessage", "Invalid email or password. Please try again.");
//            return "login";
//        }
//        System.out.println("Nmae from controller:"+name);
//        model.addAttribute("name",name);
//        return "login";
//    }

}
