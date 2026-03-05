package com.example.day6app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        int num = 10; // num is a primitive data type
        Integer number = new Integer(10); // number is an object
        
        System.out.println(number);
        String strNum = "200";
        int n1 = Integer.parseInt(strNum);
        System.out.println(n1);
        
        Integer numObject = 5; // autoboxing, int to Integer
        
        int num2 = numObject; // Integer to int unboxing
        
        // type casting
        // double -> float -> long -> int 
        
        int x = 100;
        
        double dx = x; // implicit casting, as there is no data loss.
        
        double dy = 3.456;
        
        int nx = (int)dy; // explicit casting.
        
        
        String s1 = "hello";
        
        // creating 10000 string objects - biggest memory issue
        for(int i=0; i<1;i++) {
        	s1 = s1 + i;
        	System.out.println(s1);
        }
        
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        System.out.println(sb);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
