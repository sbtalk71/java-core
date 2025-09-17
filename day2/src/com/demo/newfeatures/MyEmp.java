package com.demo.newfeatures;

public record MyEmp(int id, String name,String location,double salary) {
	
	public MyEmp(int id, String name,String location,double salary) {
		if(id<1) throw new IllegalArgumentException("Id cannot be less than 1");
		this.id=id;
		this.name=name;
		this.location=location;
		this.salary=salary;
	}
	
};