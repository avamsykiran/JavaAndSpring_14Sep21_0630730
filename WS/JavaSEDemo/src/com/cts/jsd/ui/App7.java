package com.cts.jsd.ui;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.cts.jsd.model.Employee;
import com.cts.jsd.service.EmployeeNameCompartor;

public class App7 {

	public static void main(String[] args) {
		
		//Set<Employee> emps = new HashSet<Employee>();
		//Set<Employee> emps = new LinkedHashSet<Employee>();
		//Set<Employee> emps = new TreeSet<Employee>();
		
		Set<Employee> emps = new TreeSet<Employee>(new EmployeeNameCompartor());
		
		emps.add(new Employee(101, "Vamsy", 45600));
		emps.add(new Employee(110, "Arun", 57600));
		emps.add(new Employee(104, "Zameer", 35600));
		emps.add(new Employee(103, "Chiru", 5600));
		emps.add(new Employee(107, "Supriya", 15600));
		emps.add(new Employee(105, "Bharwa", 85600));
		emps.add(new Employee(102, "David", 15600));
		emps.add(new Employee(109, "Fhatima", 95600));
		emps.add(new Employee(108, "Edward", 56600));
		emps.add(new Employee(106, "George", 25600));
		
		for(Employee emp:emps) {
			System.out.println(emp);
		}
	}

}
