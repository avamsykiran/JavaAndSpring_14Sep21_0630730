package com.cts.jsd.ui;

import com.cts.jsd.model.BankAccount;
import com.cts.jsd.service.SwappingService;

public class App5 {

	public static void main(String[] args) {
		
		String s1 = "Hello ";
		String s2= "World ";
		SwappingService<String> strSwap = new SwappingService<String>();
		strSwap.doSwap(s1, s2);
		
		BankAccount a1 = new BankAccount("1234",5600);
		BankAccount a2 = new BankAccount("7890",50600);
		SwappingService<BankAccount> baSwap = new SwappingService<>();
		baSwap.doSwap(a1, a2);
		
	
	}

}
