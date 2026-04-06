package com.example.springjdbcapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeDao dao = context.getBean("employeeDao",EmployeeDao.class);
        
        Employee employee = dao.findById(1);
        System.out.println(employee);
        
    }
}







