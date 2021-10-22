package com.cts.scd.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cts.scd.service.GreetService;

@Component
public class MainView {

	@Autowired
	@Qualifier("gssi")
	private GreetService greetService1;
	
	@Autowired
	@Qualifier("gspi")
	private GreetService greetService2;
	
	@Autowired
	@Qualifier("gsmi")
	private GreetService greetService3;
	
	@Autowired
	@Qualifier("gsmi2")
	private GreetService greetService4;
	
	public void run() {
		System.out.println("Application Initiated");
		System.out.println(greetService1.greetUser("Vamsy"));
		System.out.println(greetService2.greetUser("Vamsy"));
		System.out.println(greetService3.greetUser("Vamsy"));
		System.out.println(greetService4.greetUser("Vamsy"));
	}
}
