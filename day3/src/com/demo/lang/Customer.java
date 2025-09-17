package com.demo.lang;

import java.util.Objects;

public class Customer {

	private int customerId;
	private String customerName;

	public Customer() {

	}

	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode called");
		return Objects.hash(customerId);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals called..");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return customerId == other.customerId;
	}

	@Override
	public String toString() {
		
		return customerId+" "+customerName;
	}
	
}
