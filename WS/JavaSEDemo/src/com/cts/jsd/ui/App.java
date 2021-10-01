package com.cts.jsd.ui;

import com.cts.jsd.model.Circle;
import com.cts.jsd.model.Rectangle;
import com.cts.jsd.service.EsitmatorService;

public class App {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 20);
		Circle c = new Circle(11.2);
		
		EsitmatorService es = new EsitmatorService(12, 4);
		
		System.out.println(r);
		System.out.println(c);
		
		System.out.println(es.estiamtePaintingCost(r));
		System.out.println(es.estiamtePaintingCost(c));
		System.out.println(es.estiamteBorderingCost(r));
		System.out.println(es.estiamteBorderingCost(c));
	}

}
