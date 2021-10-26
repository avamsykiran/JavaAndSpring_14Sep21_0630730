package com.cts.sbd.util;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Counter {

	private int count;
	
	public int getCount() {
		return ++count;
	}
}
