package com.demo.inheritance;

public class InteritanceMain {
	
	
	public static void printDetails(Person p) {
		System.out.println(p.getDetails());
	}

	public static void main(String[] args) {
				
		Person p=new Person(100,"John");
		
		System.out.println(p.getDetails());
		
		Employee e=new Employee(101, "Raghav", 67000);
		
		System.out.println(e.getDetails());
		
		//--------------------------------------//
		
		Employee emp=new Employee(102, "Ankit", 77000);
		
		TraineeEmployee te=new TraineeEmployee(103, "Rohit", 56000, "good");
		
		Person person;
		
		person=emp;
		
		System.out.println(person.getDetails());
		
		person=te;
		
		System.out.println(person.getDetails());
		
		
		printDetails(p);
		
		printDetails(e);
		
		printDetails(te);
		
		
		System.out.println(p);
		
		
	

	}

}
