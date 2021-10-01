package com.cts.jsd.service;

import com.cts.jsd.model.Shape;

public class EsitmatorService {

	private double paintingRate;
	private double borderingRate;
	
	public EsitmatorService(double paintingRate, double borderingRate) {
		this.paintingRate = paintingRate;
		this.borderingRate = borderingRate;
	}
	
	public double estiamtePaintingCost(Shape s) {
		return this.paintingRate*s.getArea();
	}
	
	public double estiamteBorderingCost(Shape s) {
		return this.borderingRate*s.getPerimeter();
	}
}
