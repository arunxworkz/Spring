package com.xworkz.requestmapping.component;


import com.xworkz.requestmapping.dto.HotelDTO;
import com.xworkz.requestmapping.service.HotelInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@RequestMapping("/")
public class HotelForm {

    public HotelForm(){
        System.out.println("This is HotelForm constructor");
    }

    @Autowired
    private HotelInterface hoetl;


    @RequestMapping(value = "/book")
    public String method(HotelDTO dto){
        System.out.println("HotelDTO data"+ dto);
        boolean saved = hoetl.validateSave();
        if(saved){
            System.out.println("Saved");
        }else{
            System.out.println("Not saved");
        }
        return "hotel.jsp";
    }
}
