package com.example.honeapp;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.model.Passport;
import com.example.model.Person;

public class OneToOneApp {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Person person = new Person();
        person.setName("Ravi Kumar");
        person.setAge(30);

        Passport passport = new Passport();
        passport.setPassportNumber("IND987654");
        passport.setIssuePlace("Bangalore");

        passport.setPerson(person);
        person.setPassport(passport);

        session.persist(person);

        tx.commit();
        session.close();
        sessionFactory.close();

        System.out.println("One-to-One data saved successfully");
    }
}


