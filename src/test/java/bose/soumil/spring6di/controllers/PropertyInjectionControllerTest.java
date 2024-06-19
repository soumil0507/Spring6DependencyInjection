package bose.soumil.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bose.soumil.spring6di.services.GreetingServiceImpl;

public class PropertyInjectionControllerTest {

    PropertyInjectionController propertyInjectionController;

    @BeforeEach
    void setUp(){
        propertyInjectionController = new PropertyInjectionController();

        propertyInjectionController.greetingService = new GreetingServiceImpl();

    }

    @Test
    void sayHello() {

        System.out.println(propertyInjectionController.sayHello());
    }
}
