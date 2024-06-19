package bose.soumil.spring6di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import bose.soumil.spring6di.controllers.MyController;

@SpringBootTest
class Spring6diApplicationTests {


	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutowireOfController(){
		myController.sayHello();
	}

	@Test
	void testGetControllerFromCtx(){
		MyController controller = applicationContext.getBean(MyController.class);
		// System.out.println("In Test");
		System.out.println(controller.sayHello());

	}

	@Test
	void contextLoads() {
	}

}
