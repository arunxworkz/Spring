package com.xworkz.loginpro.pro;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Login extends AbstractAnnotationConfigDispatcherServletInitializer {

    public Login(){
        System.out.println("This is login class");
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
        System.out.println("Configured");
        return urls;
    }
}
