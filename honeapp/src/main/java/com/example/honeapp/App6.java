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
public class App6 
{
    public static void main( String[] args )
    {
    	// get the session factory
        SessionFactory sessionFactory =
        		new Configuration().configure().buildSessionFactory();
       
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();

        BRUser user = session.get(BRUser.class, 4);
        
        session.delete(user);
        
        transaction.commit(); 

        session.close(); 
        
        // now user object is detached 
        
        
    }
}
