package com.coreJava.oops.aadharRegistration;

public class AadharRegistration {
	String name;
	String address;
	long mobile;

	public boolean registerAdhar(String name,String address,long mobile) {
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		
		System.out.println("name :" + name);
		System.out.println("address :" + address);
		System.out.println("mobile :" + mobile);
		
		return (this.name != null && this.address != null && this.mobile != 0);
	}
}
