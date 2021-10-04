package com.cts.jdbcdemo.ui;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App1 {

	public static void main(String[] args) {
		
		//select * from GLOBAL_NAME;
	
		final String dbUrl = "jdbc:oracle:thin:@localhost:1521/XE";
		final String uid="hr";
		final String pwd="hr";
		
		try( 
				Connection con = DriverManager.getConnection(dbUrl,uid,pwd);
            ){
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDriverVersion());
		}catch(SQLException exp) {
			System.out.println(exp.getMessage());
		}

	}

}
