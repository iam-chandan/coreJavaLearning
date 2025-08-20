package com.coreJava.oops.aadharRegistration;



public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AadharRegistration aadharRegistration = new AadharRegistration();
		aadharRegistration.registerAdhar("Abhijit", "bangalore", 452871369l);
		
		GovtAuthCenter govtAuthCenter = new GovtAuthCenter();
		System.out.println(govtAuthCenter.registerAdhar());
	}

}
