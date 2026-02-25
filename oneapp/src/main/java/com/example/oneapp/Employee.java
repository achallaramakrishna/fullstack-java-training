package com.example.oneapp;

public class Employee {
	
	// instance variable
	private int empID;
	private String name;
	
	// class variable
	private static int count;
	

	// static method
	public static int getCount() {
		return count;
	}
	public Employee(int empID, String name) {
		count++;
		this.empID = empID;
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + "]";
	}
	
	
	

}
