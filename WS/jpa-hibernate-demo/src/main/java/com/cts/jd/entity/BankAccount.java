package com.cts.jd.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="jpaBankAccounts")
public class BankAccount {

	@Id
	private Long accNum;
	private String ifscCode;
	
	@OneToOne(mappedBy = "salAccount")
	private Employee holder;
	
	public BankAccount() {}

	public BankAccount(Long accNum, String ifscCode, Employee holder) {
		super();
		this.accNum = accNum;
		this.ifscCode = ifscCode;
		this.holder = holder;
	}

	public Long getAccNum() {
		return accNum;
	}

	public void setAccNum(Long accNum) {
		this.accNum = accNum;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public Employee getHolder() {
		return holder;
	}

	public void setHolder(Employee holder) {
		this.holder = holder;
	}

	@Override
	public String toString() {
		return "BankAccount [accNum=" + accNum + ", ifscCode=" + ifscCode + "]";
	}
	
	
}
