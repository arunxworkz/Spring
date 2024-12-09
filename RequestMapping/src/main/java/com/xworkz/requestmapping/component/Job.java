package com.xworkz.requestmapping.component;


import com.xworkz.requestmapping.dto.JobDTO;
import com.xworkz.requestmapping.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@RequestMapping("/")
public class Job {

    @Autowired
    private JobService jobService;

    @RequestMapping(value = "/getJob")
    public String job(JobDTO dto){
        System.out.println("The applicant details: "+dto);
        jobService.validateSave();
        return "job.jsp";
    }
}
