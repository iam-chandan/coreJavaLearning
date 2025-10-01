package com.coreJava.exceptionHandling.customException;


public class Driver {

	public static void main(String[] args) {
		Bank bank = new Bank("14258963",1425,2000);
		bank.transferAmount(3000);
	}
}
