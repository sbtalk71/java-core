package com.demo.abstractdemo;

public class AbstractMain {

	public static void main(String[] args) {
		Figure ref;
		
		Triangle t= new Triangle(10,20);
		
		Rectangle r= new Rectangle(20,30);
		
		ref=t;
		System.out.println(ref.area());
		
		ref=r;
		System.out.println(ref.area());

	}

}
