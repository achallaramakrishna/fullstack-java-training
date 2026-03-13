package com.example.honeapp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.model.BRUser;

/**
 * Hello world!
 *
 */
public class App4 
{
    public static void main( String[] args )
    {
    	// get the session factory
        SessionFactory sessionFactory =
        		new Configuration().configure().buildSessionFactory();
       
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();

        int userId = 3;
        // hql 
	    Query query = session.createQuery("from BRUser where userId =:userId");
        query.setParameter("userId", userId);
	    
        List userList = query.list();
        
        System.out.println(userList);
        
        transaction.commit(); 

        session.close(); 
        
        // now user object is detached 
        
        
    }
}
