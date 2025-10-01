package com.coreJava.oops.interfaceAfterJava8.adharRegistration;

public class CSCCenter implements IAadharRegistration{

	@Override
	public void register() {
		System.out.println("CSCCenter.register() : you have registered for aadhar. wait for approval");
	}

	@Override
	public void approve() {
		System.out.println("CSCCenter.approve() : your aadhar application approved");
	}

	@Override
	public void suspend() {
		System.out.println("CSCCenter.suspend() : your application rejected");
	}
	
	@Override
	public void updateAddress() {
		System.out.println("CSCCenter.updateAddress() : address updated");
	}
	
	public void updatemobileNumber() {
		System.out.println("CSCCenter.updatemobileNumber() : mobile number updated");
	}
}
