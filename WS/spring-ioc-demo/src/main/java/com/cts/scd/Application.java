package com.cts.scd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.scd.service.GreetService;
import com.cts.scd.ui.MainView;
import com.cts.scd.util.Counter;

public class Application {

	public static void main(String[] args) {
		//GreetService gs = new GreetServiceSimpleImpl();
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfiguaration.class);
		
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
		
		MainView view = (MainView) context.getBean("mainView");
		view.run();
	}

}
