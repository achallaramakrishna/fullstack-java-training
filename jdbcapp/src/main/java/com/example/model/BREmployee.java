package com.example.model;

public class BREmployee {

	private int empId;
	
	private String firstName;
	
	private String lastName;
	
	private double basic;
	
	private String designation;
	
	private String email;

	public BREmployee() {
		
	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "BREmployee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", basic=" + basic
				+ ", designation=" + designation + ", email=" + email + "]";
	}
	
	
	
}



