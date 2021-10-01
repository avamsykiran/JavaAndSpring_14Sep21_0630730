package com.cts.jsd.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.cts.jsd.model.Employee;
import com.cts.jsd.service.EmployeeNameCompartor;

public class App8 {

	public static void main(String[] args) {
		
		//List<Employee> emps = new Vector<Employee>();
		//List<Employee> emps = new LinkedList<Employee>();
		List<Employee> emps = new ArrayList<Employee>();
		
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
				
		//Collections.sort(emps);
		Collections.sort(emps,new EmployeeNameCompartor());
		for(Employee emp:emps) {
			System.out.println(emp);
		}
	}

}
