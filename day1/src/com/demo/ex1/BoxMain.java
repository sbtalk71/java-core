package com.demo.ex1;

public class BoxMain {

	public static void main(String[] args) {
		
		//Box b1=new Box();
		//b1.length=20;
		Box b1=new Box(10,20,30);
		
		System.out.println(b1.getVolume());
		
       Box b2=new Box(20,20,30,"blue");
		
		System.out.println(b2.getVolume());
		
		Box b3=new Box(20,20,30,"blue",21.5);
		

	}

}
