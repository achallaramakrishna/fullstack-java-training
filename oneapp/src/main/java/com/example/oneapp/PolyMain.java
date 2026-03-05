package com.example.oneapp;

public class PolyMain {

	public static void main(String[] args) {
		
		Base base = new Base();
		base.show();
		
		Derived derived = new Derived();
		derived.show();
		
		Base base1 = new Derived();
		base1.show(); // overriding takes place

		base1 = new NewDerived();
		base1.show();
		//at compile time we cant predict
		// at run time we can predict.
	}

}
