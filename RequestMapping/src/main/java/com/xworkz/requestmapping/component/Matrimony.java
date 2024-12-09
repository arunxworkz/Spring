package com.xworkz.requestmapping.component;

import com.xworkz.requestmapping.dto.MatrimonyDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Component
@EnableWebMvc
@RequestMapping("/")
public class Matrimony {


    public Matrimony(){
        System.out.println("This is Matrimony");
    }

    @RequestMapping("/")
    public String enage(){
        return "matrimony.jsp";
    }
}
