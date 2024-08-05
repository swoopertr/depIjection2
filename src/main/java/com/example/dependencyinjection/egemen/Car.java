package com.example.dependencyinjection.egemen;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Car implements Ivehicle{
private String model;
private int KM;

//constructor
public Car(){
    System.out.println("CarClass");
}

public int getKM(){
    return   KM;
}

public  void  setKM(int _KM){
    this.KM = _KM;
}
}
