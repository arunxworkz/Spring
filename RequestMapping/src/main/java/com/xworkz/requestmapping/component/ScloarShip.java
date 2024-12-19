package com.xworkz.requestmapping.component;

import com.xworkz.requestmapping.dto.ScloarshipDTO;
import com.xworkz.requestmapping.service.Scloarship;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@RequestMapping("/")
public class ScloarShip {
    public ScloarShip(){
        System.out.println("This is scloarship");
    }

    private Scloarship scloarship;
    public String ammount(ScloarshipDTO dto){
        if(scloarship.scloarship()){
            System.out.println("Thsi is scloarship");
        }
        return "Scolarship.jsp";
    }
}
