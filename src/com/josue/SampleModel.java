package com.josue;

public class SampleModel {
	
	// Attributes
	private String name;
	private String lastname;
	private long age;
	
	// Constructor
	public SampleModel(String name, String lastname, long age) {
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	
	// Method to show all attributes
	public void showAll() {
		System.out.println("\n--- Sample info ---");
		System.out.println("Name: " + name);
		System.out.println("Last name: " + lastname);
		System.out.println("Age: " + age);
	}
	
	
}
