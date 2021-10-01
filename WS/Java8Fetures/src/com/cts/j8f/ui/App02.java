package com.cts.j8f.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class App02 {

	public static void main(String[] args) {
		
		//Supplier<String> greetNote = () -> "Hai ";
		
		Supplier<String> greetNote = () -> {
			String note = "";
			
			int h = LocalTime.now().getHour();
			
			if(h>=3 && h<=12) note = "Good Morning ";
			else if(h>12 && h<=16) note = "Good Noon ";
			else note="Good Evening ";
			
			return note;
		};
		
		Consumer<String> greet = userName -> System.out.println(greetNote.get() + userName);	
		greet.accept("Vamsy");
 	
	}
}
