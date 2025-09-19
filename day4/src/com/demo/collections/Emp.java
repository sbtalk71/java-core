package com.demo.collections;

import java.util.Objects;

public class Emp implements Comparable<Emp>{
	private int id;
	private String name;
	private double salary;

	public Emp() {
		
	}

	public Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "["+id+" "+name+" "+salary+"]";
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode called..");
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals called..");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id;
	}

	@Override
	public int compareTo(Emp s2) {
		// TODO Auto-generated method stub
		return this.name.compareTo(s2.getName());
	}
	
	
}
