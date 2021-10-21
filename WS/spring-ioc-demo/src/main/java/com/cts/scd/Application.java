package com.cts.scd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.scd.service.GreetService;

public class Application {

	public static void main(String[] args) {
		//GreetService gs = new GreetServiceSimpleImpl();
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfiguaration.class);
		
		GreetService gs1 = (GreetService) context.getBean("gssi");
		System.out.println(gs1.greetUser("Vamsy"));
	}

}
