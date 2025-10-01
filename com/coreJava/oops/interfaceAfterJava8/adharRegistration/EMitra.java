package com.coreJava.oops.interfaceAfterJava8.adharRegistration;

public class EMitra implements IAadharRegistration{

	@Override
	public void register() {
		System.out.println("EMitra.register() : you have registered for aadhar. wait for approval");
	}

	@Override
	public void approve() {
		System.out.println("EMitra.approve() : your aadhar application approved");
	}

	@Override
	public void suspend() {
		System.out.println("EMitra.suspend() : your application rejected");
	}

	@Override
	public void updateAddress() {
		System.out.println("EMitra.updateAddress() : address updated");
	}
	
	public void updatemobileNumber() {
		System.out.println("EMitra.updatemobileNumber() : mobile number updated");
	}
}
