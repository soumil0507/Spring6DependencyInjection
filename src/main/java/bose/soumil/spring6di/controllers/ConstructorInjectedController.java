package bose.soumil.spring6di.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import bose.soumil.spring6di.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;


    public ConstructorInjectedController(@Qualifier("greetingServiceBean") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
