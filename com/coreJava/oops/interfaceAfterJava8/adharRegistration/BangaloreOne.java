package com.coreJava.oops.interfaceAfterJava8.adharRegistration;

public class BangaloreOne implements IAadharRegistration{

	@Override
	public void register() {
		System.out.println("BangaloreOne.register() : you have registered for aadhar. wait for approval");
	}

	@Override
	public void approve() {
		System.out.println("BangaloreOne.approve() : your aadhar application approved");
	}

	@Override
	public void suspend() {
		System.out.println("BangaloreOne.suspend() : your application rejected");
	}
	
	@Override
	public void updateAddress() {
		System.out.println("BangaloreOne.updateAddress() : address updated");
	}
	
	public void updatemobileNumber() {
		System.out.println("BangaloreOne.updatemobileNumber() : mobile number updated");
	}
}
