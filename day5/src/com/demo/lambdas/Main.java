package com.demo.lambdas;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Greeter greeter= new Greeter();
		
		greeter.greet(new GoodMorning());
		
		greeter.greet(new Greet() {
			@Override
			public String getMessage() {
				
				return "Good Afternoon";
			}
		});

		Greet ge=()->"good Evening";
		
		greeter.greet(()->"good Evening");
		
		Comparator<String> comp=(s1,s2)->s1.compareTo(s2);
	}

}

class GoodMorning implements Greet{
	@Override
	public String getMessage() {
		
		return "Good Morning";
	}
}
