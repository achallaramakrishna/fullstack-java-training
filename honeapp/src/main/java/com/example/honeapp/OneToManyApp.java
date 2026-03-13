package com.example.honeapp;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.model.BRUser;
import com.example.model.Department;
import com.example.model.Employee;

public class OneToManyApp {

	public static void main(String[] args) {
		// get the session factory
        SessionFactory sessionFactory =
        		new Configuration().configure().buildSessionFactory();
       
        
        
        
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Department dept = new Department();
        dept.setDeptName("IT");

        Employee e1 = new Employee();
        e1.setEmpName("Ravi");

        Employee e2 = new Employee();
        e2.setEmpName("Anita");

        e1.setDepartment(dept);
        e2.setDepartment(dept);

        dept.setEmployees(Arrays.asList(e1, e2));

        session.persist(dept);

        tx.commit();
        session.close();
        
	}
}
