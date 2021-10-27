package com.cts.sbdd;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cts.sbdd.ui.ContactUI;

@SpringBootApplication
public class SpringBootDataDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataDemoApplication.class, args);
	}

	@Autowired
	private ContactUI view;
	
	@Override
	public void run(String... args) throws Exception {
		view.run();
	}

	@Bean
	public Scanner kbin() {
		return new Scanner(System.in);
	}
}
