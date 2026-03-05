package com.example.oneapp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(BREmployee.getCount());
    	
        BREmployee e1 = new BREmployee(1,"rama");
    	System.out.println(BREmployee.getCount());

        BREmployee e2 = new BREmployee(2,"hari");
        System.out.println(e1);
        System.out.println(e2);
    	System.out.println(BREmployee.getCount());
    	
    	Single s1 = Single.getInstance();
    	Single s2 = Single.getInstance();
    	
    	if(s1 == s2) {
    		System.out.println("same objects");
    	} else {
    		System.out.println("different objects");
    	}
    	// Single s3 = new Single();
    	
    	Employee employee = new Employee(1,"rama","achalla",100,"Trainer");
    	
    	System.out.println(employee);
    }
}














