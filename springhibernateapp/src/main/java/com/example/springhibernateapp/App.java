package com.example.springhibernateapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dao.EmployeeHibernateDao;
import com.example.model.Employee;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeHibernateDao dao =
                context.getBean(EmployeeHibernateDao.class);

        Employee emp = new Employee();
        emp.setName("Krishna");
        emp.setDepartment("Finance");
        emp.setSalary(250000.0);

        dao.save(emp);

        System.out.println("Employee saved successfully.");
    }
}