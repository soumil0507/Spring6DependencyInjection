package bose.soumil.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bose.soumil.spring6di.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp(){

        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
        System.out.println(setterInjectedController);
    }

    @Test
    void testSayHello() {
        System.out.println(setterInjectedController.sayHello());

    }
}
