package com.demo.exceptions;

public class WrappersDemo {

	public static void main(String[] args) {
		//traditional Approach
		
		int x=10;
		Integer i1=new Integer(x);
		
		//new Approach from Java 1.5
		
		Integer y=x; //Autoboxing
		
		int t=y; //auto unboxing
		

	}

}
