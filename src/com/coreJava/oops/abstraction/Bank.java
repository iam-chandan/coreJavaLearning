package com.coreJava.oops.abstraction;

abstract class Bank {
	public Bank() {
		
	}
	public abstract void credit();
	public abstract void debit();
	public abstract void showBalance();
}

class Account extends Bank{
	public void credit() {
		System.out.println("Account.credit()");
	}
	public void debit() {
		System.out.println("Account.debit()");
	}
	public void showBalance() {
		System.out.println("Account.showBalance()");
	}
}
class Driver{
	public static void main(String[] args) {
		Account ac = new Account();
		ac.credit();
		ac.debit();
		ac.showBalance();
	}
}