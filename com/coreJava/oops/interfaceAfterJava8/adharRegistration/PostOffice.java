package com.coreJava.oops.interfaceAfterJava8.adharRegistration;

public class PostOffice implements IAadharRegistration{

	@Override
	public void register() {
		System.out.println("PostOffice.register() : you have registered for aadhar. wait for approval");
	}

	@Override
	public void approve() {
		System.out.println("PostOffice.approve() : your aadhar application approved");
	}

	@Override
	public void suspend() {
		System.out.println("PostOffice.suspend() : your application rejected");
	}
	
	@Override
	public void updateAddress() {
		System.out.println("PostOffice.updateAddress() : updated");
	}
	
}
