package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.egemen.Car;
import com.example.dependencyinjection.egemen.Ivehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/egemen")
public class EgemenController {


    private Ivehicle egoNewCar;
    private Ivehicle egoAmarok;
    private Ivehicle duplicateCar;

    //@Autowired
    public EgemenController(@Qualifier("car") Ivehicle _car,
                            @Qualifier("fourMotionCar") Ivehicle _fourMotion,
                            @Qualifier("car") Ivehicle _duplicateCar){
        this.egoNewCar = _car;
        this.egoAmarok = _fourMotion;
        this.duplicateCar = _duplicateCar;
    }

    @GetMapping("/")
    public String setGetCar(){
        egoNewCar.setKM(555);
        egoAmarok.setKM(666);
        duplicateCar.setKM(777);
        return  " Bu sıradan araba "+ egoNewCar.getKM() + " " +
               " bu da Amorok " + egoAmarok.getKM() + " bu da duplicate " + duplicateCar.getKM();
    };



}
