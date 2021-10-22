package com.cts.scd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.scd.service.GreetService;
import com.cts.scd.ui.MainView;

public class Application {

	public static void main(String[] args) {
		//GreetService gs = new GreetServiceSimpleImpl();
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfiguaration.class);
		
		MainView view = (MainView) context.getBean("mainView");
		view.run();
	}

}
