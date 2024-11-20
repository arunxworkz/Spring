package com.xworkz.pixelhaven.runner;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Pixel extends AbstractAnnotationConfigDispatcherServletInitializer {

    public Pixel(){
        System.out.println("This is pixel class");
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
        System.out.println("Configured file");
        return urls;
    }
}
