package com.xworkz.requestmapping.component;

import com.xworkz.requestmapping.dto.Organdto;
import com.xworkz.requestmapping.service.OragnDonation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@RequestMapping("/")
public class OrganDonationm {
    public OrganDonationm(){
        System.out.println("Thsi si organ donation");
    }

    private OragnDonation oragnDonation;

    @RequestMapping("/organ")
    public String organMethod(Organdto dto){
        System.out.println("The details are:"+ dto);
        if(oragnDonation.donate()){
            System.out.println("Organ is donated");
        }else{
            System.out.println("Oragn is not donated");
        }
        return "organdonation.jsp";
    }
}
