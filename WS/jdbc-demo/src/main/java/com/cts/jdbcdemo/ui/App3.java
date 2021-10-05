package com.cts.jdbcdemo.ui;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final String dbUrl = "jdbc:oracle:thin:@localhost:1521/XE";
		final String uid="hr";
		final String pwd="hr";
		
		try( 
				Connection con = DriverManager.getConnection(dbUrl,uid,pwd);
				PreparedStatement pst = con.prepareStatement("INSERT INTO items VALUES(?,?,?)");
            ){
		
			boolean shallContinue=true;
			while(shallContinue) {
				System.out.print("Item Id: ");
				int itemId = scan.nextInt();
				System.out.print("Item Name: ");
				String itemName = scan.next();
				System.out.print("Item Price: ");
				double price = scan.nextDouble();
				
				pst.setInt(1, itemId);
				pst.setString(2, itemName);
				pst.setDouble(3, price);
				
				int count = pst.executeUpdate();
				System.out.println(count +" record(s) inserted");
				
				System.out.print("Continue(true/false)? ");
				shallContinue=scan.nextBoolean();
			}
		}catch(SQLException exp) {
			System.out.println(exp.getMessage());
		}

	}

}
