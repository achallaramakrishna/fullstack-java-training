package com.example.oneapp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(Employee.getCount());
    	
        Employee e1 = new Employee(1,"rama");
    	System.out.println(Employee.getCount());

        Employee e2 = new Employee(2,"hari");
        System.out.println(e1);
        System.out.println(e2);
    	System.out.println(Employee.getCount());
    	
    	Single s1 = Single.getInstance();
    	Single s2 = Single.getInstance();
    	
    	if(s1 == s2) {
    		System.out.println("same objects");
    	} else {
    		System.out.println("different objects");
    	}
    	// Single s3 = new Single();

    }
}














