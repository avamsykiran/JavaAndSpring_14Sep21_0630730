package com.cts.jsd.service;

import com.cts.jsd.exception.BankingException;
import com.cts.jsd.model.BankAccount;

public class BankingService {
	
	public static final double MIN_BAL=4500;

	public void deposite(BankAccount account,double amount) throws BankingException {
		
		if(amount<=0) {
			throw new BankingException("Deposite amount can not be negative or zero");
		}
		
		account.setCurrentBalance(account.getCurrentBalance()+amount);
	}
	
	public void withdraw(BankAccount account,double amount) throws BankingException {
		
		if(amount<=0) {
			throw new BankingException("Withdraw amount can not be negative or zero");
		}
		
		if(account.getCurrentBalance()-amount<MIN_BAL) {
			throw new BankingException("Insufficient Balance");
		}
		
		account.setCurrentBalance(account.getCurrentBalance()-amount);
	}
}
