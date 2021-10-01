package com.cts.jsd.service;

public class SwappingService<T> {
	public void doSwap(T e1, T e2) {
		System.out.println(e1 + "\t"+e2);
		T temp = e1;
		e1 = e2;
		e2 = temp;
		System.out.println(e1 + "\t"+e2);
	}
}