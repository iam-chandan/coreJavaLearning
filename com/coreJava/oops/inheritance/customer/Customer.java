package com.coreJava.oops.inheritance.customer;

public class Customer {
	int customerId;
	String customerName;
	String customerAddress;
	
}

class Order extends Customer{
	public void isOrderPlaced() {
		System.out.println("order placed for customer id " + customerId);
	}
}

