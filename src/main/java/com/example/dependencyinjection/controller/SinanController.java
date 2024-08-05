package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.sinan.Automobile;
import com.example.dependencyinjection.sinan.Ivehicle;
import com.example.dependencyinjection.sinan.Tractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sinan")
public class SinanController {

    //@Autowired
    private Ivehicle myVehicle;// = new Automobile("Sarı Mercedes", 001);
    private Ivehicle mySecondVehicle;
    private Ivehicle myThirdVehicle;

    @Autowired
    public SinanController(@Qualifier("automobile") Ivehicle vehicle,
                           @Qualifier("tractor") Ivehicle vehicle2,
                           @Qualifier("automobile") Ivehicle vehicle3) {
        myVehicle = vehicle;
        mySecondVehicle = vehicle2;
        myThirdVehicle = vehicle3;

    }

    @GetMapping("/")
    public String getSinanController() {
        //Automobile tmp = (Automobile) mercedes;
        //tmp.increaseMileage(10);
        return myVehicle.getVehicleName() + " " + mySecondVehicle.getVehicleName();
    }

    @GetMapping("/check")
    public boolean check(){
        return myVehicle == myThirdVehicle;
    }
}
