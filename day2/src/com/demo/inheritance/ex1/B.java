package com.demo.inheritance.ex1;

public class B extends A{

	public final String message="hello";
	
	public B(String s) {
		System.out.println("B's constructor...");
	}
	
	/*
	 * public void setMessage(String msg) { message=msg; }
	 */
}
