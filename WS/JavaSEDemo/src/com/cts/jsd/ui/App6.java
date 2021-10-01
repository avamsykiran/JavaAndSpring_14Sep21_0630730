package com.cts.jsd.ui;

import java.util.Random;
import java.util.Scanner;

public class App6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many to be generated? ");
		while(!scan.hasNextInt()) {
			scan.nextLine();
		}
		int count=scan.nextInt();
	
		Random random = new Random();
		for(int i=1;i<=count;i++)
			System.out.println(random.nextInt(100));
	}

}
