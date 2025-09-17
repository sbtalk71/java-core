package com.demo.newfeatures.sealedclass;

public final class CreditCardPayment extends Payment{

	@Override
	public void pay(double amount) {
		System.out.println("paid "+amount+" Using Credit Card");
		
	}

}
