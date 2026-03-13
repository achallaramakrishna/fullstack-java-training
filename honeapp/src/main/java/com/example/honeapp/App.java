package com.example.honeapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.model.BRUser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// get the session factory
        SessionFactory sessionFactory =
        		new Configuration().configure().buildSessionFactory();
       
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();

        // fetching the data from the db
        BRUser user = session.get(BRUser.class,2);
        // now user is a persistent object.
        System.out.println(user);
        
        transaction.commit(); 

        session.close(); 
        
        // now user object is detached 
        
        
    }
}
