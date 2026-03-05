package com.example.day2app;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try { // put the code in observation.
			int a = 10;
			int b = 0;
			System.out.println(a/b);
			
		} catch(ArithmeticException ae) { // handled the exception
			System.out.println(ae);
			ae.printStackTrace();
		} finally {
			System.out.println("The end");
		}
		

	}

}
