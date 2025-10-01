package com.coreJava.oops.interfaceAfterJava8.adharRegistration;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSCCenter csc = new CSCCenter();
		BangaloreOne blr = new BangaloreOne();
		ESeva eSeva = new ESeva();
		EMitra eMitra = new EMitra();
		Banks banks = new Banks();
		PostOffice post = new PostOffice();
		System.out.println("********** CSC CENTER **********");
		csc.register();
		csc.approve();
		csc.suspend();
		csc.updateAddress();
		csc.updatemobileNumber();
		System.out.println("********** BANGALORE ONE **********");
		blr.register();
		blr.approve();
		blr.suspend();
		blr.updateAddress();
		blr.updatemobileNumber();
		System.out.println("********** E-Seva **********");
		eSeva.register();
		eSeva.approve();
		eSeva.suspend();
		eSeva.updateAddress();
		eSeva.updatemobileNumber();
		System.out.println("********** E-MITRA **********");
		eMitra.register();
		eMitra.approve();
		eMitra.suspend();
		eMitra.updateAddress();
		eMitra.updatemobileNumber();
		System.out.println("********** BANKS **********");
		banks.register();
		banks.approve();
		banks.suspend();
		banks.updatemobileNumber();
		System.out.println("********** POST OFFICE **********");
		post.register();
		post.approve();
		post.suspend();
		post.updateAddress();
	}

}
