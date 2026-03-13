package com.example.soneapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Car;
import com.example.model.Student;
import com.example.model.Trainer;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student");
        // student.setId(100);
        // student.setName("Rohit");
        // student.setCourse("Java");
         
         System.out.println(student);   
        Trainer trainer = (Trainer) context.getBean("trainer");
        
        System.out.println(trainer);
        
     
        Car car = (Car) context.getBean("car");

        car.drive();
    }
}