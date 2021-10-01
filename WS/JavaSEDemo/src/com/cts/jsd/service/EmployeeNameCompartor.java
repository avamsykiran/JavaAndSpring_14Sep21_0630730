package com.cts.jsd.service;

import java.util.Comparator;

import com.cts.jsd.model.Employee;

public class EmployeeNameCompartor implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}

}
