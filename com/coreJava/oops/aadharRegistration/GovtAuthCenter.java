package com.coreJava.oops.aadharRegistration;

public class GovtAuthCenter extends AadharRegistration {
	public String registerAdhar() {
		if(registerAdhar("Abhijit","Bangalore",85263147952l)) {
			return "Aadhar registered successfully";
		}
		return "Failed to register";
	}
}
