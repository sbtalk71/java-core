package com.demo.newfeatures.sealedclass;

public non-sealed class NetBankingPayment extends Payment{

	@Override
	public void pay(double amount) {
		System.out.println("paid "+amount+" Using Net Banking");
		
	}

}
