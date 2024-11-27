package com.xworkx.taskflow;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Flow1 extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    public Flow1(){
        System.out.println("This is TASKFLOW application");
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        String[] urls = {"/"};
        System.out.println("Configured urls of DispatcherServlet");
        return urls;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }




}
