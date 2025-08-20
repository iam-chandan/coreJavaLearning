package com.coreJava.oops;

public class Driver {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("Abhijit");
		customer.setCustomerAddress("Bangalore");
		customer.setCustomerMobile(8547546l);
		
		System.out.println(customer.getCustomerId());
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getCustomerMobile());
		System.out.println(customer.getCustomerAddress());
		System.out.println("**************************");
		Car car = new Car();
		car.setCarName("Mahendra");
		car.setCarMilage(12);
		car.setCarModelName("XUV 3x0");
		
		System.out.println(car.getCarName());
		System.out.println(car.getCarMilage());
		System.out.println(car.getCarModelName());
	}
}
