package com.example.jdbcapp1;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class App 
{
    public static void main( String[] args )
    {
    	Connection connection = null;
    	
    	String jdbcUrl = "jdbc:mysql://localhost:3306/broadridge_db";
    	String userName = "root";
    	String userPwd = "achalla";
    	String sql = "select * from employees where emp_id = ?";
    	int empId = 1;
    	
    	try {
    		// load the jdbc driver
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		
    		// get a connection
    		connection = DriverManager.getConnection(jdbcUrl,userName,userPwd);
    		PreparedStatement pStatement = connection.prepareStatement(sql);
    		pStatement.setInt(1, empId);
    		
    		ResultSet rs = pStatement.executeQuery();
    		while(rs.next()) {
    			System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " +rs.getString(3) +", " + 
    					rs.getDouble(4) + ", " +rs.getString(5) + ", " + rs.getString(6));
    		}
    		
    		
    		
    	}catch (SQLException e) {
    		e.printStackTrace();
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	    }
}
