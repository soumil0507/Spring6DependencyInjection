package bose.soumil.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import bose.soumil.spring6di.services.GreetingServiceImpl;

@SpringBootTest
public class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController controller;

    // @BeforeEach
    // void setup(){
    //     controller = new ConstructorInjectedController(new GreetingServiceImpl());
    // }

    @Test
    void testSayHello() {

        System.out.println(controller.sayHello());

    }
}
