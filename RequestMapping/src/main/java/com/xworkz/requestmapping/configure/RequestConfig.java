package com.xworkz.requestmapping.configure;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.xworkz.requestmapping")
public class RequestConfig {

    public RequestConfig(){
        System.out.println("This is RequestCOnfig class");
    }


}
