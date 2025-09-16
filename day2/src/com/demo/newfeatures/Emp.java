package com.demo.newfeatures;

public class Emp {

	private int id;
	private String name;
	private String location;
	private double salary;
	
	public Emp() {
		
	}

	public Emp(int id, String name, String location, double salary) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
