package com.example.jpaapp;

import com.example.model.Student;
import com.example.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManager em = JPAUtil.getFactory().createEntityManager();
        
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        
        Student student = new Student("Amar","Java");
        
        em.persist(student);
        
        tx.commit();
        
        em.close();
        
        
        
    }
}
