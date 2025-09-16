package com.demo.ex1;

public class Duck {
	static {
		System.out.println("Static Block executes..");
	}
	
	 static int duckCount=0;
	
	public Duck() {
		Duck.duckCount++;
	}
	
	
	public static void fun() {
		System.out.println("Static method...");
		
	}
	
	
	public void fun2() {
		System.out.println("non static method..");
		//fun();
	}
	
}
