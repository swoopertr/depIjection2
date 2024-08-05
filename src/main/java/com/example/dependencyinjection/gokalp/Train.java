package com.example.dependencyinjection.gokalp;

import org.springframework.stereotype.Component;

@Component
public class Train implements  Ivehicle {
    public String trainModel;
    public int topSpeed;
    public int trainYear;

    public Train(){
        System.out.println("TrainClass");
    }

    @Override
    public String functionName1() {
        return "Yolcu Treni";
    }

    @Override
    public String functionName2(String abc) {
        return "Yüksek Hızlı Tren";
    }

    @Override
    public int functionId() {
        return 0;
    }

    @Override
    public int shipPrice() {
        return 0;
    }


}
