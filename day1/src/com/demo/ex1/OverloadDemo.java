package com.demo.ex1;

public class OverloadDemo {
	
	public void add() {
		System.out.println(" Nothing to add");
	}
	
	/*
	 * public int add(int a, int b) {
	 * System.out.println("add(int , int ) called..."); return a+b; }
	 */
	
	public float add(int a,float b) {
		System.out.println("add(int , float ) called...");
		return a+b;
	}
	
	public double add(double a, double b) {
		System.out.println("add(double , double ) called...");
		return a+b;
	}

	public static void main(String[] args) {
		
		OverloadDemo od= new  OverloadDemo();
		od.add();
		od.add(1,2);
		od.add(2,3.0f);
		od.add(1.0,2.0);
	}

}
