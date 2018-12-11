package com.rest.demo;

public class Student {
	
	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private String zipCode;
	public Student(int id, String firstName, String lastName, String gender, String zipCode) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.zipCode = zipCode;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getGender() {
		return gender;
	}
	public String getZipCode() {
		return zipCode;
	}

}