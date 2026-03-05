package com.example.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.dao.BREmployeeDao;
import com.example.model.BREmployee;
import com.example.util.DBConnection;

public class BREmployeeDaoImpl implements BREmployeeDao {

	public List<BREmployee> findAll() throws SQLException {
		
    	String sql = "select * from employees";

		Connection connection = DBConnection.getConnection();
		List<BREmployee> empList = null;
		if(connection!=null) {
			
			// get the statement
    		Statement statement = null;
    		ResultSet resultSet = null;
    		
    		empList = new ArrayList<BREmployee>();
    		
    		// get the result set
    		
    		BREmployee employee = null;
    		
    		if(connection !=null) {
    			
    			statement = connection.createStatement();
    			resultSet = statement.executeQuery(sql);
    			while(resultSet.next()) {
    				employee = new BREmployee();
    				employee.setEmpId(resultSet.getInt(1));
    				employee.setFirstName(resultSet.getString(2));
    				employee.setLastName(resultSet.getString(3));
    				employee.setBasic(resultSet.getDouble(4));
    				employee.setDesignation(resultSet.getString(5));
    				employee.setEmail(resultSet.getString(6));
    				
    				empList.add(employee);
    			}
    			
    		} else {
    			System.out.println("Connection not Successful");
    		}
    	
		}
		return empList;
	}

	@Override
	public int save(BREmployee employee) throws SQLException {
		Connection connection = DBConnection.getConnection();
		String sql = "insert into employees (first_name,last_name,basic,designation,email) "
				+ "values (?,?,?,?.?)";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, employee.getFirstName());
		pStatement.setString(2, employee.getLastName());
		pStatement.setDouble(3, employee.getBasic());
		pStatement.setString(4, employee.getDesignation());
		pStatement.setString(5, employee.getEmail());

		int rowsAffected = pStatement.executeUpdate();
		return rowsAffected;
	}

	@Override
	public int update(BREmployee employee) throws SQLException {
		Connection connection = DBConnection.getConnection();
		String sql = "update employees set first_name = ? , last_name = ? , "
				+ "basic = ?, designation =?, email = ? "
				+ "where emp_id = ?";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, employee.getFirstName());
		pStatement.setString(2, employee.getLastName());
		pStatement.setDouble(3, employee.getBasic());
		pStatement.setString(4, employee.getDesignation());
		pStatement.setString(5, employee.getEmail());
		pStatement.setInt(6, employee.getEmpId());
		

		int rowsAffected = pStatement.executeUpdate();
		return rowsAffected;
	}

	@Override
	public int delete(BREmployee employee) throws SQLException {
		Connection connection = DBConnection.getConnection();
		String sql = " delete from employees where emp_id = ?";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		
		pStatement.setInt(1, employee.getEmpId());
		int rowsAffected = pStatement.executeUpdate();
		return rowsAffected;}

	@Override
	public BREmployee findById(int id) throws SQLException {
		Connection connection = DBConnection.getConnection();
		String sql = "select * from employees where emp_id = ?";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setInt(1, id);
		
		ResultSet rs = pStatement.executeQuery();
		BREmployee employee =null;
		if(rs.next()) {
			employee = new BREmployee();
			employee.setEmpId(id);
			employee.setFirstName(rs.getString(2));
			employee.setLastName(rs.getString(3));
			employee.setBasic(rs.getDouble(4));
			employee.setDesignation(rs.getString(5));
			employee.setEmail(rs.getString(6));
		}
		return employee;
	}

}
