package com.demo.inheritance;

public class Person {

	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	
	public String getDetails() {
		return id+" "+name;
	}
	
	public String getDetails(String name) {
		return this.id+ " "+name;
	}
	
	
	@Override
	public String toString() {
		return "["+id+" "+name+"]";
	}
}
