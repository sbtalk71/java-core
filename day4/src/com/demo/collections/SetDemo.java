package com.demo.collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class SetDemo {

	public static void main(String[] args) {
		//Set<String> fruits=new HashSet<String>();
		SortedSet<String> fruits=new TreeSet<String>();
		
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("guava");
		fruits.add("orange");
		//fruits.add(123);
		
		
		System.out.println("No of elements : "+fruits.size());
		
		System.out.println("Is apple there : "+fruits.contains("apple"));
		
				
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
