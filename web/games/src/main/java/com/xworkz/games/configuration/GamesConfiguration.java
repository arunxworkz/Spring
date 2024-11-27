package com.xworkz.games.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.games.component")
@Configuration
public class GamesConfiguration {
    public GamesConfiguration(){
        System.out.println("This is game configuration");
    }

    @Bean
    public  String teamName(){
        System.out.println("Thi is configuration of team name");
        return "This is team configuration";
    }

    @Bean
    public double budget(){
        System.out.println("Thi is configuration of budget");
        return 10.32;
    }

    @Bean
    public String ownerName(){
        System.out.println("Thi is configuration of Owner name");
        return " This is owner";
    }

    @Bean
    public double ballCost(){
        System.out.println("Thi is configuration of Ball cost");
        return 10.32;
    }

    @Bean
    public double batCost(){
        System.out.println("Thi is configuration of bat cost");
        return 10.32;
    }

}
