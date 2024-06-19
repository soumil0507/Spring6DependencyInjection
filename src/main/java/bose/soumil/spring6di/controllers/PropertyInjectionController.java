package bose.soumil.spring6di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import bose.soumil.spring6di.services.GreetingService;

@Controller
public class PropertyInjectionController {

    @Autowired
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
