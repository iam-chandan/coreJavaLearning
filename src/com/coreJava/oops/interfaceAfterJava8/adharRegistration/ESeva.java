package com.coreJava.oops.interfaceAfterJava8.adharRegistration;

public class ESeva implements IAadharRegistration{

	@Override
	public void register() {
		System.out.println("ESeva.register() : you have registered for aadhar. wait for approval");
	}

	@Override
	public void approve() {
		System.out.println("ESeva.approve() : your aadhar application approved");
	}

	@Override
	public void suspend() {
		System.out.println("ESeva.suspend() : your application rejected");
	}

	@Override
	public void updateAddress() {
		System.out.println("ESeva.updateAddress() : address updated");
	}
	
	public void updatemobileNumber() {
		System.out.println("ESeva.updatemobileNumber() : mobile number updated");
	}
}
