package bose.soumil.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import bose.soumil.spring6di.services.GreetingServiceImpl;

@SpringBootTest
public class PropertyInjectionControllerTest {

    @Autowired
    PropertyInjectionController propertyInjectionController;

    // @BeforeEach
    // void setUp(){
    //     propertyInjectionController = new PropertyInjectionController();

    //     propertyInjectionController.greetingService = new GreetingServiceImpl();

    // }

    @Test
    void sayHello() {

        System.out.println(propertyInjectionController.sayHello());
    }
}
