package com.example.day2app;

public class Employee extends Person {
	
	private int empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Employee(String firstName, String lastName, int empId) {
		super(firstName, lastName);
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ "]";
	}
	
	

}
