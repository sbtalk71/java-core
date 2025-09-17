package com.demo.exceptions;

public class ClubMain {

	public static void main(String[] args) {
		Club club = new Club();
		try {
			club.validateAge(17);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

		System.out.println("Closing the club now..");
	}

}
