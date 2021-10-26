package com.cts.sbd.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cts.sbd.service.GreetService;

@Component
public class MainView {
	
	@Autowired
	@Qualifier("kbin")
	private Scanner kbin;

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
		
		System.out.print("User Name:> ");
		String userName = kbin.nextLine();
		
		System.out.println(greetService1.greetUser(userName));
		System.out.println(greetService2.greetUser(userName));
		System.out.println(greetService3.greetUser(userName));
		System.out.println(greetService4.greetUser(userName));
	}
}
