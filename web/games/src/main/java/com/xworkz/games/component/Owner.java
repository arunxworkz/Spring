package com.xworkz.games.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    @Autowired
    private String ownerName;
    public  Owner(){
        System.out.println("Thi si sowner const");
    }
}
