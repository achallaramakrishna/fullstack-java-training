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
public class App2 
{
    public static void main( String[] args )
    {
    	// get the session factory
        SessionFactory sessionFactory =
        		new Configuration().configure().buildSessionFactory();
       
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();

        BRUser user = new BRUser();
        
        user.setFirstName("Virat");
        user.setLastName("Kohli");
        user.setUserName("virat");
        user.setUserPwd("virat123");
        user.setMobile("94949494");
        user.setEmail("virat.kohli@gmail.com");
        user.setProfileId(3);
        
        session.save(user);
        
        transaction.commit(); 

        session.close(); 
        
        // now user object is detached 
        
        
    }
}
