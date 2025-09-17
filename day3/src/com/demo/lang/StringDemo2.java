package com.demo.lang;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1="    hello there";
		String s2="Where were you    ";
		
		System.out.println(s1);
		System.out.println(s1.stripLeading());
		
		System.out.println(s2);
		System.out.println(s2.stripTrailing());
		
	String	s3="this is a java class as java is still evolving";
	
	System.out.println(s3.indexOf("java"));
	
	String[] words=s3.split(" ");
	System.out.println("No of words : "+words.length);
	
	
		

	}

}
