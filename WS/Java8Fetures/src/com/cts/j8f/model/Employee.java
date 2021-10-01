package com.cts.j8f.model;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
	
	private int empId;
	private String name;
	private double basicPay;
	private LocalDate joinDate;
	
	public Employee(){}

	public Employee(int empId, String name, double basicPay,LocalDate joinDate) {
		super();
		this.empId = empId;
		this.name = name;
		this.basicPay = basicPay;
		this.joinDate=joinDate;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", basicPay=" + basicPay + ", joinDate=" + joinDate
				+ "]";
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public int compareTo(Employee o) {
		return this.empId-o.empId;
	}

	
}
