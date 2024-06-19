package bose.soumil.spring6di.controllers;

import bose.soumil.spring6di.services.GreetingService;

public class PropertyInjectionController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
