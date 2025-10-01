package com.coreJava.oops.aadharRegistration;

public class OnlineRegistration extends AadharRegistration {
	public String registerAdhar() {
		if(registerAdhar("Swarna","Berhampur",852631458222l)) {
			return "Aadhar registered successfully";
		}
		return "Failed to register";
	}
}
