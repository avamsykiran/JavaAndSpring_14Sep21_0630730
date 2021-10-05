package com.cts.jdbcdemo.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App4 {

	public static void main(String[] args) {
		
		final String dbUrl = "jdbc:oracle:thin:@localhost:1521/XE";
		final String uid="hr";
		final String pwd="hr";
		
		try( 
				Connection con = DriverManager.getConnection(dbUrl,uid,pwd);
				PreparedStatement pst = con.prepareStatement("SELECT * FROM items");
            ){
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int icode = rs.getInt(1);
				String iname = rs.getString(2);
				double iprice = rs.getDouble(3);
				System.out.println(icode +"\t"+iname+"\t"+iprice);
			}
		}catch(SQLException exp) {
			System.out.println(exp.getMessage());
		}

	}

}
