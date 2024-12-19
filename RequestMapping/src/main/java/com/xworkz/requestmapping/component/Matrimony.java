package com.xworkz.requestmapping.component;

import com.xworkz.requestmapping.dto.MatrimonyDTO;
import com.xworkz.requestmapping.service.MatrimonyService;
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

    private MatrimonyService matrimony;

    @RequestMapping("/matrimony")
    public String enage(MatrimonyDTO dto){
        System.out.println("This is matrimony: "+dto);
        if(matrimony.matrimony()){
            System.out.println("this is matrimony data");
        }else{
            System.out.println("This is not matrimony data");
        }
        return "matrimony.jsp";
    }
}
