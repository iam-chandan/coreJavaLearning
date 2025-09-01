package com.coreJava.oops.interfaceAfterJava8.adharRegistration;

public class Banks implements IAadharRegistration{

	@Override
	public void register() {
		System.out.println("Banks.register() : you have registered for aadhar. wait for approval");
	}

	@Override
	public void approve() {
		System.out.println("Banks.approve() : your aadhar application approved");
	}

	@Override
	public void suspend() {
		System.out.println("Banks.suspend() : your application rejected");
	}

	public void updatemobileNumber() {
		System.out.println("Banks.updatemobileNumber() : mobile number updated");
	}
}
