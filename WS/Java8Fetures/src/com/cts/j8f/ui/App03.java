package com.cts.j8f.ui;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cts.j8f.model.Employee;

public class App03 {
	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<Employee>();

		emps.add(new Employee(101, "Vamsy", 45600, LocalDate.of(2020, Month.OCTOBER, 11)));
		emps.add(new Employee(110, "Arun", 57600, LocalDate.of(2010, Month.OCTOBER, 11)));
		emps.add(new Employee(104, "Zameer", 35600, LocalDate.of(2011, Month.OCTOBER, 11)));
		emps.add(new Employee(103, "Chiru", 5600, LocalDate.of(2009, Month.OCTOBER, 11)));
		emps.add(new Employee(107, "Supriya", 15600, LocalDate.of(2021, Month.JANUARY, 11)));
		emps.add(new Employee(105, "Bharwa", 85600, LocalDate.of(2008, Month.OCTOBER, 11)));
		emps.add(new Employee(102, "David", 15600, LocalDate.of(2020, Month.JUNE, 11)));
		emps.add(new Employee(109, "Fhatima", 95600, LocalDate.of(2001, Month.OCTOBER, 11)));
		emps.add(new Employee(108, "Edward", 56600, LocalDate.of(2000, Month.OCTOBER, 11)));
		emps.add(new Employee(106, "George", 25600, LocalDate.of(2021, Month.OCTOBER, 11)));

		//Collections.sort(emps);
		//Comparator<Employee> empComparator = (e1,e2) -> e1.getName().compareTo(e2.getName());
		//Comparator<Employee> empComparator = (e1,e2) -> e1.getJoinDate().compareTo(e2.getJoinDate());
		Comparator<Employee> empComparator = (e1,e2) -> {
			Double d1 = e1.getBasicPay();
			Double d2 = e2.getBasicPay();
			return d1.compareTo(d2);
		};
		Collections.sort(emps,empComparator);
		for (Employee emp : emps) {
			System.out.println(emp);
		}
	}
}
