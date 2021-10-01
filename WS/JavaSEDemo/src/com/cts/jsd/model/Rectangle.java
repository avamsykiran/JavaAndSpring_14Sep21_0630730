package com.cts.jsd.model;

public class Rectangle implements Shape{
	
	private int length;
	private int breadth;
	
	public Rectangle() {
		this.length=5;
		this.breadth=5;
	}

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		return this.length*this.breadth;
	}

	@Override
	public double getPerimeter() {
		return 2*(this.length+this.breadth);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

	
}
