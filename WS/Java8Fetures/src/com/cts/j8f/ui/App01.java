package com.cts.j8f.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class App01 {

	public static void main(String[] args) {

		LocalDateTime rightNow = LocalDateTime.now();
		System.out.println(rightNow);
		
		ZonedDateTime singapureTime = ZonedDateTime.now(ZoneId.of("GMT+0800"));
		System.out.println(singapureTime);
		
		LocalDate dob = LocalDate.of(1985, Month.JUNE, 11);
		LocalDate today = LocalDate.now();
		
		Period age = Period.between(dob, today);
		System.out.println(age.toTotalMonths()/12.0);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy dd,MMMM");
		System.out.println(dob.format(fmt));
		System.out.println(today.format(fmt));
		
		LocalDate retirementDate = dob.plusYears(65);
		System.out.println(retirementDate.format(fmt));
	}
}
