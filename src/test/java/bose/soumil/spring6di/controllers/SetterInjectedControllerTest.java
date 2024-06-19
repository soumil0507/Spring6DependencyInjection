package bose.soumil.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import bose.soumil.spring6di.services.GreetingServiceImpl;

@SpringBootTest
public class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController setterInjectedController;

    // @BeforeEach
    // void setUp(){

    //     setterInjectedController = new SetterInjectedController();
    //     setterInjectedController.setGreetingService(new GreetingServiceImpl());
    //     System.out.println(setterInjectedController);
    // }

    @Test
    void testSayHello() {
        System.out.println(setterInjectedController.sayHello());

    }
}
