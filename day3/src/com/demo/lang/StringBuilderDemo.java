package com.demo.lang;

public class StringBuilderDemo {

	public static void main(String[] args) {
		//StringBuilder sb= new StringBuilder();
		StringBuffer sb= new StringBuffer();
		
		sb.append("Mr Bean").append("earns Rs ").append(300000).insert(7, " In India ");
		System.out.println(sb);
		
		sb.replace(3, 7, "Chatur");
		System.out.println(sb.reverse());

	}

}
