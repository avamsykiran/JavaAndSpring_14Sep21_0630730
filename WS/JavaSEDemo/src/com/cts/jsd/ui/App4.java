package com.cts.jsd.ui;

import java.util.Scanner;

import com.cts.jsd.exception.BankingException;
import com.cts.jsd.model.BankAccount;
import com.cts.jsd.service.BankingService;

public class App4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean shallContinue=true;
		
		BankingService bs = new BankingService();
		BankAccount account=new BankAccount("10000890",55000);
		double amount=0;
		
		while(shallContinue) {
			System.out.print("Enter 1-Deposite,2-Withdraw,3-Balance,4-Quit:> ");
			while(!scan.hasNextInt()) {
				scan.nextLine();
			}
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Deposite Amount? ");
				while(!scan.hasNextDouble()) {
					scan.nextLine();
				}
				amount=scan.nextDouble();
				try {
					bs.deposite(account, amount);
				} catch (BankingException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.print("Withdraw Amount? ");
				while(!scan.hasNextDouble()) {
					scan.nextLine();
				}
				amount=scan.nextDouble();
				try {
					bs.withdraw(account, amount);
				} catch (BankingException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println(account.getCurrentBalance());
				break;
			case 4:
				System.out.println("App Terminated");
				break;
			default:
					System.out.println("Unknown choice");
			}
			
			System.out.print("Continue(true/false)? ");
			while(!scan.hasNextBoolean()) {
				scan.nextLine();
			}
			shallContinue=scan.nextBoolean();
			
			scan.close();
		}
	}

}
