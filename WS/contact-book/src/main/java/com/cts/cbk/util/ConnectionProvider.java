package com.cts.cbk.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionProvider {

	private static ConnectionProvider instance;
	
	private String dbUrl;
	private String uid;
	private String pwd;
	
	private ConnectionProvider() throws FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(new FileInputStream("application.properties"));
		this.dbUrl=props.getProperty("db.url");
		this.uid=props.getProperty("db.uid");
		this.pwd=props.getProperty("db.pwd");
	}
	
	public static ConnectionProvider getInstance() throws FileNotFoundException, IOException {
		if(instance==null) {
			instance=new ConnectionProvider();
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(this.dbUrl,this.uid,this.pwd);
	}
}
