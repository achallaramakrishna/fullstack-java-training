package com.example.day2app;

// once a class is final, then we cannot inherit from it.
 class Base {
	public   void show() { // if a method is final, then you cannot override.
		System.out.println("base show");
	}
}

public class MyClass extends Base {

	// declare the constant
	public static final double pi = 3.14;
	
	public  void show() {
		System.out.println("derived show");
	}

}

// you can change the value of pi.
// declare a constant.
