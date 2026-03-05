package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection connection;
	
	public static Connection getConnection() {
    	String jdbcUrl = "jdbc:mysql://localhost:3306/broadridge_db";
    	String userName = "root";
    	String userPwd = "achalla";
    	String sql = "select * from employees";
    	try {
    		// load the jdbc driver
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		
    		// get a connection
    		connection = DriverManager.getConnection(jdbcUrl,userName,userPwd);
    		return connection;
    		
    	}catch (SQLException e) {
    		e.printStackTrace();
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return null;

	}
	
	public static void close() {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
