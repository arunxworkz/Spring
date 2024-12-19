package com.xworkz.requestmapping.component;


import com.xworkz.requestmapping.dto.PassportDTO;
import com.xworkz.requestmapping.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@RequestMapping("/")
public class Passport {

    @Autowired
    private PassportService service;

    public String passport(PassportDTO dto){
        System.out.println("This is passport:" + dto);
        service.validate();
        return "Passport.jsp";
    }

}
