package com.coreJava.oops.constructor;

public class Customer {
	public Customer() {
		System.out.println("you have ordered from meghna");
	}
}
class Resturant extends Customer{
	public Resturant() {
		this("meghna",400);
	}
	
	public Resturant(String resturantName,int price) {
		System.out.println("your order from " + resturantName + " is ready , price is " + price + ".");
	}
}

class Delivery extends Resturant{
	public Delivery() {
		System.out.println("order placed successfully!!!");
	}
}

