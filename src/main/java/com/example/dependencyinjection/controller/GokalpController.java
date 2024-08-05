package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.gokalp.Ivehicle;
import com.example.dependencyinjection.gokalp.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gokalp")
public class GokalpController {

    //@Autowired
    private Ivehicle gokalpTrain;
    private Ivehicle gokalpShip;

    @Autowired
    public GokalpController(
           @Qualifier("train") Ivehicle train,
           @Qualifier("ship") Ivehicle ship
    ){
        gokalpTrain = train;
        gokalpShip = ship;
    }


    @GetMapping("/")
    public String gokalpController(){
       return gokalpTrain.functionName1() + gokalpShip.functionName2("şip");
    }

}
