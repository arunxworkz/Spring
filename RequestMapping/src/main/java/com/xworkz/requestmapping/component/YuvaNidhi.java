package com.xworkz.requestmapping.component;


import com.xworkz.requestmapping.dto.YuvanidhiDTO;
import com.xworkz.requestmapping.service.Yuvanidhi;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Component
@EnableWebMvc
@RequestMapping("/")
public class YuvaNidhi {
    public YuvaNidhi(){
        System.out.println("This is yuvanidhi");
    }


    private Yuvanidhi yuvanidhi;
    @RequestMapping(value = "/money")
    public String yavuNidhi(YuvanidhiDTO dto){
        System.out.println(dto);
        if(yuvanidhi.nidhi()){
            System.out.println("I got the Yuvanidhi");
        }else{
            System.out.println("i lost Yuvanodhi");
        }
        return("yuvanidhi.jsp");
    }
}
