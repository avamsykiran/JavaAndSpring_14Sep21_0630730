package com.cts.jdbcdemo.ui;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App2 {

	public static void main(String[] args) {
		
		//select * from GLOBAL_NAME;
	
		final String dbUrl = "jdbc:oracle:thin:@localhost:1521/XE";
		final String uid="hr";
		final String pwd="hr";
		
		try( 
				Connection con = DriverManager.getConnection(dbUrl,uid,pwd);
            ){
			String qry = 
					"create table items(" +
							"icode number(4) primary key,"+
							"iname varchar2(50) not null,"+
							"iprice number(10,2) not null )";
			Statement st = con.createStatement();
			st.execute(qry);
			System.out.println("Table created!");
		}catch(SQLException exp) {
			System.out.println(exp.getMessage());
		}

	}

}
