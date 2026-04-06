package com.example.springjdbcapp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;

/**
 * Hello world!
 *
 */
public class App4 
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeDao dao = context.getBean("employeeDao",EmployeeDao.class);
        
        List<Employee> employees = dao.findAll();
        
        System.out.println(employees);
        
    }
}







