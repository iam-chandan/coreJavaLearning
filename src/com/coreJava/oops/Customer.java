package com.coreJava.oops;


public class Customer {
	private int customerId;
	private String customerName;
	private long customerMobile;
	private String customerAddress;
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setCustomerMobile(long customerMobile) {
		this.customerMobile = customerMobile;
	}
	
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public long getCustomerMobile() {
		return customerMobile;
	}
	
	public String getCustomerAddress() {
		return customerAddress;
	}
}

//public class Driver{
//	public static void main(String[] args) {
//		
//		Customer customer = NEW Customer();
//		customer.setCustomerId(101);
//		customer.setCustomerName("Abhijit");
//		customer.setCustomerAddress("Bangalore");
//		customer.setCustomerMobile(854754123496l);
//		
//		System.out.println(customer.getCustomerId());
//		System.out.println(customer.getCustomerName());
//		System.out.println(customer.getCustomerMobile());
//		System.out.println(customer.getCustomerAddress());
//	}
//}






















