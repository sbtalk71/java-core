package com.demo.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		//List<String> fruits=new ArrayList<String>();
		//List<String> fruits=new LinkedList<String>();
		List<String> fruits=new Vector<>(); //should be used in multithreaded environments
		
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("guava");
		fruits.add("orange");
		//fruits.add(123);
		
		
		System.out.println("No of elements : "+fruits.size());
		
		System.out.println("Is apple there : "+fruits.contains("apple"));
		
		System.out.println("element at 3 index "+fruits.get(3));
		
		fruits.add(2,"banana");
		System.out.println(fruits);
		
		/*
		 * Iterator<String> itr=fruits.iterator(); while(itr.hasNext()) { String
		 * fruit=itr.next(); System.out.println(fruit); }
		 */
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		

	}

}
