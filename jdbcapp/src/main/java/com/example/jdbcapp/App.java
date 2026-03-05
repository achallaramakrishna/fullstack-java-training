package com.example.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.model.BREmployee;
import com.example.dao.*;
import com.example.dao.impl.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        BREmployeeDao dao = new BREmployeeDaoImpl();
        
    	List<BREmployee> list = dao.findAll();
    	
    	System.out.println("DAo Pattern");
    	System.out.println(list);
    	
    	BREmployee employee = dao.findById(1);
    	System.out.println(employee);
    	
    //	BREmployee newEmployee = new BREmployee();
    //	newEmployee.setFirstName("Hari");
    //	newEmployee.setLastName("Sharma");
    //	newEmployee.setBasic(2000);
    //	newEmployee.setDesignation("Manager");
    //	newEmployee.setEmail("hari@gmail.com");

    //	int rowsAffected = dao.save(newEmployee);
    	
    	// update functionality
    	
    	employee.setBasic(12345);
    	
    	int rowsAffected = dao.update(employee);
    	
    	
    	BREmployee delEmployee = dao.findById(3);
    	rowsAffected = dao.delete(delEmployee);
    }
}






