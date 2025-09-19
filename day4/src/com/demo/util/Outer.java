package com.demo.util;

public class Outer {

	public void outerFun() {
		System.out.println("Outer class method");
	}
	static class Inner1{
		public void inner1Fun() {
			System.out.println("inner1 class method");
		}
	}
	
	class Inner2{
		public void inner2Fun() {
			System.out.println("inner2 class method");
		}
	}
	
	
	public static void main(String[] args) {
		Inner1 a= new Inner1();
		Outer o=new Outer();
		
		Inner2 b= o.new Inner2();
	}
}
