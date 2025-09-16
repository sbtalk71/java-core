package com.demo.ex1;

public class VarargsDemo {

	public static int add(int ...numbers) {
		
		int sum=0;
		for(int num:numbers) {
			sum=sum+num;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		
		System.out.println("Sum of 2,4,5 is : "+add(2,4,5));
	}

}
