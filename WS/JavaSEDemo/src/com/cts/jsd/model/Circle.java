package com.cts.jsd.model;

public class Circle implements Shape {

	private double radius;
	
	public Circle() {
		this.radius=10;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return PI*Math.pow(this.radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2*PI*this.radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	
}
