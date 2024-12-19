package com.xworkz.requestmapping.component;

import com.xworkz.requestmapping.dto.DeathCertificateDTO;
import com.xworkz.requestmapping.service.DeathCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DeathCertificate {
    public DeathCertificate(){
        System.out.println("This is  Death certificate pagfe");
    }

    @Autowired
    private DeathCertificateService certificate;

    @RequestMapping("/get")
    public void certificate(DeathCertificateDTO dto){
        System.out.println("Details are: "+dto);
        if(certificate.validate()){
            System.out.println("This si certificate");
        }else{
            System.out.println("This is not certificate");
        }
    }

}
