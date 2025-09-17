package com.demo.newfeatures;

public class SwitchStatementDemo {

	public static void main(String[] args) {

		Day day = Day.WEDNESDAY;
		int numLetters = 0;
		switch (day) {
		case MONDAY, FRIDAY, SUNDAY:
			numLetters = 6;
			break;
		case THURSDAY, SATURDAY:
			numLetters = 7;
			break;
		case WEDNESDAY:
			numLetters = 9;
			break;
		default:
			throw new IllegalStateException("Wrong Value Provided..");

		}
		System.out.println(numLetters);
	}

}
