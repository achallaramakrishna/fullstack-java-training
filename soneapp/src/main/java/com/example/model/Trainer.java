package com.example.model;

public class Trainer {
	
	private int id;
	
	private String name;
	
	private String subject;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Trainer() {
		
	}
	
	

	public Trainer(int id, String name, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", subject=" + subject + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getSubject()=" + getSubject() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
