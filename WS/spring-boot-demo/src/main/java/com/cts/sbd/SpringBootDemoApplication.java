package com.cts.sbd;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.cts.sbd.ui.MainView;
import com.cts.sbd.util.Counter;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Autowired
	private MainView view;

	@Autowired
	private ApplicationContext context;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(((Counter) context.getBean("counter")).getCount());
		System.out.println(((Counter) context.getBean("counter")).getCount());
		System.out.println(((Counter) context.getBean("counter")).getCount());
		System.out.println(((Counter) context.getBean("counter")).getCount());
		System.out.println(((Counter) context.getBean("counter")).getCount());
		System.out.println(((Counter) context.getBean("counter")).getCount());
		
		System.out.println(context.getBean("currentTime"));
		System.out.println(context.getBean("currentTime"));
		System.out.println(context.getBean("currentTime"));
		System.out.println(context.getBean("currentTime"));
		System.out.println(context.getBean("currentTime"));
		
		view.run();
	}
	
	@Bean
	public Scanner kbin() {
		return new Scanner(System.in);
	}
	
	@Bean
	@Scope("prototype")
	public LocalDateTime currentTime() {
		return LocalDateTime.now();
	}

}
