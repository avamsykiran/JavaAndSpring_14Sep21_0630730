package com.cts.jsd.model;

public interface Shape {
	
	public static final double PI=3.14;
	
	double getArea();
	double getPerimeter();
	
	static double add(Shape s1,Shape s2) {
		return s1.getArea()+s2.getArea();
	}
}
