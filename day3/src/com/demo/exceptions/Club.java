package com.demo.exceptions;

public class Club {

	public void validateAge(int age) {
		try {
			if (age < 18 || age > 60) {
				throw new InvalidAgeException("Age not allowed");
			}
			System.out.println("Welcome to the club..");
		} catch (InvalidAgeException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
	}
}
