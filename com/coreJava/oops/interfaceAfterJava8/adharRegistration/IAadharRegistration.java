package com.coreJava.oops.interfaceAfterJava8.adharRegistration;

public interface IAadharRegistration {
	
	void register();
	void approve();
	void suspend();
	
	default void updateAddress() {
		System.out.println("address updated");
	}
	
	public static void updatemobileNumber() {
		System.out.println("mobile number updated");
	}
}
