package com.example.dependencyinjection.egemen;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class FourMotionCar implements Ivehicle{
    private int KM;

    //constructor
    public FourMotionCar(){
        System.out.println("FourMotionCarClass");
    }


    @Override
    public int getKM() {
        return this.KM;
    }

    @Override
    public void setKM(int _KM) {
    this.KM = _KM;
    }
}
