package com.demo.lang;

public class Main {

	public static void main(String[] args) {
		Customer c1=new Customer(1, "John");
		
		Customer c2=new Customer(1, "John");
		
		Customer c3=new Customer(2, "John");
		
		System.out.println(c1==c2);
		
		System.out.println(c1.equals(c2));

		
		System.out.println(c1.equals(c3));
		
		System.out.println(c3);
	}

}
