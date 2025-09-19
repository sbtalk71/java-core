package com.demo.newfeatures;

public class PatternMatchingInstanceOf {

	public static void main(String[] args) {
		
		Object msg="Hello There";
		
		if(msg instanceof String) {
			String s=(String)msg;
			System.out.println(s.length());
			
		}
		
		if(msg instanceof String s) {
			System.out.println(s.length());
			
		}
		

	}

}
