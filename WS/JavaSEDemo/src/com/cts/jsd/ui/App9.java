package com.cts.jsd.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.cts.jsd.model.Employee;

public class App9 {

	public static void main(String[] args) {
		
		Map<Long,Employee> emps = new HashMap<>();
		
		emps.put(101L,new Employee(101, "Vamsy", 45600));
		emps.put(110L,new Employee(110, "Arun", 57600));
		emps.put(104L,new Employee(104, "Zameer", 35600));
		emps.put(103L,new Employee(103, "Chiru", 5600));
		emps.put(107L,new Employee(107, "Supriya", 15600));
		emps.put(105L,new Employee(105, "Bharwa", 85600));
		emps.put(102L,new Employee(102, "David", 15600));
		emps.put(109L,new Employee(109, "Fhatima", 95600));
		emps.put(108L,new Employee(108, "Edward", 56600));
		emps.put(106L,new Employee(106, "George", 25600));
				
		Set<Long> empIds = emps.keySet();
		for(Long empId : empIds) {
			System.out.println(emps.get(empId));
		}
	}

}
