package com.example.oneapp;

public class Employee extends Person {
	
	private int empId;
	private double basic;
	private String designation;
	
	
	public Employee(int empId, String firstName, String lastName,
				double basic, String designation) {
		
		super(firstName,lastName);
		this.empId = empId;
		this.basic = basic;
		this.designation = designation;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", basic=" + basic + ", designation=" + designation + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	

}
