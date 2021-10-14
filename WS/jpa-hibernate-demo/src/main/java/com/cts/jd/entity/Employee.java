package com.cts.jd.entity;

import java.time.LocalDate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="jpaEmps")
public class Employee {

	@Id
	@GeneratedValue
	private Long empId;
	private String fullName;
	private Double salary;
	private LocalDate joinDate;
	
	@Embedded
	private Address address;
	
	@OneToOne
	@JoinColumn
	private BankAccount salAccount;
	
	public Employee() {}

	public Employee(Long empId, String fullName, Double salary, LocalDate joinDate, Address address,
			BankAccount salAccount) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.salary = salary;
		this.joinDate = joinDate;
		this.address = address;
		this.salAccount = salAccount;
	}


	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public BankAccount getSalAccount() {
		return salAccount;
	}

	public void setSalAccount(BankAccount salAccount) {
		this.salAccount = salAccount;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fullName=" + fullName + ", salary=" + salary + ", joinDate=" + joinDate
				+ ", address=" + address + ", salAccount=" + salAccount + "]";
	}	
	
}
