package com.xworkz.games.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Team {

    @Autowired
    private String teamName;
    public Team(){
        System.out.println("Thin si team const");
    }
}
