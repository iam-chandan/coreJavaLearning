package com.coreJava.oops.polymorphism.overloading;

public class UserLogin {
	public void doLogin(String email, String password) {
		System.out.println("You have successfully logged in using your email and password.");
	}
	
	public void doLogin(String userName, String password,int otp) {
		System.out.println("You have successfully logged in using your userName and otp.");
	}
	
	public void doLogin(String aadharNo, int otp) {
		System.out.println("You have successfully logged in using your aadharNo. and otp.");
	}
	public void doLogin(long mobile, int otp) {
		System.out.println("You have successfully logged in using your mobile and otp.");
	}
}
