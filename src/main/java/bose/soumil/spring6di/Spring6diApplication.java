package bose.soumil.spring6di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import bose.soumil.spring6di.controllers.MyController;

@SpringBootApplication
public class Spring6diApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring6diApplication.class, args);
		
		MyController controller = ctx.getBean(MyController.class);
		System.out.println("In Main method!!");
		System.out.println(controller.sayHello());

	}

}
