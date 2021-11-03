package com.cts.dwa1.service;

import java.time.LocalDateTime;

public class GreetService {
	
	public String greetUser(String userName) {
		String greeting="";
		
		int h = LocalDateTime.now().getHour();
		
		if(h>=3 && h<=11) greeting="Good Morning";
		else if(h>=12 && h<=16) greeting="Good Noon";
		else greeting="Good Evening";
		
		return String.format("%s %S", greeting,userName);
	}

}
