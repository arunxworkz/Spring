package com.xworkz.games.component;

import org.springframework.beans.factory.annotation.Autowired;

public class Ball {

    @Autowired
    private double ballCost;
    public Ball(){
        System.out.println("This is Ball const");
    }
}
