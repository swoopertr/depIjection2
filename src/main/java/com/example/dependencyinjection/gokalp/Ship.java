package com.example.dependencyinjection.gokalp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Ship implements Ivehicle {

    public Ship(){
        System.out.println("ShipClass");
    }

    @Override
    public String functionName1() {
        return "Cruise Ship";
    }

    @Override
    public String functionName2(String abc) {
        return " " + abc + " Çoban";
    }

    @Override
    public int functionId() {
        return 61;
    }

    @Override
    public int shipPrice() {
        return 5000;
    }
}
