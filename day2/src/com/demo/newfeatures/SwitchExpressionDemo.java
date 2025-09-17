package com.demo.newfeatures;

public class SwitchExpressionDemo {

	public static void main(String[] args) {

		Day day = Day.WEDNESDAY;
		
		int numLetters = switch (day) {
		case MONDAY, FRIDAY, SUNDAY->6;
		case THURSDAY, SATURDAY->7;
		case WEDNESDAY->9;
		default->
			throw new IllegalStateException("Wrong Value Provided..");
		};
		
		System.out.println(numLetters);
	}

}
