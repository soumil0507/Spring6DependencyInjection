package bose.soumil.spring6di.controllers;

import org.junit.jupiter.api.Test;

public class MyControllerTest {
    @Test
    public String testSayHello() {

        MyController controller = new MyController();
        System.out.println(controller.sayHello());
        return controller.sayHello();

    }
}
