package com.cts.jsd.model;

public class BankAccount {
	
	private String accountNumber;
	private double currentBalance;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}

	public BankAccount(String accountNumber, double currentBalance) {
		super();
		this.accountNumber = accountNumber;
		this.currentBalance = currentBalance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", currentBalance=" + currentBalance + "]";
	}

	
}
