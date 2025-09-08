package com.coreJava.exceptionHandling.customException;

class Bank {
	
	private int balance;
	private String account;
	private int pin;
	
	Bank(String account,int pin,int balance){
		this.account = account;
		this.pin = pin;
		this.balance = balance;
	}
	
	public String getAccount() {
		return account;
	}
	public int getBalance() {
		return balance;
	}
	public int getPin() {
		return pin;
	}
	
	public void transferAmount(int amount) throws InsufficientBalanceException{
		if(getBalance() < amount) {
			throw new InsufficientBalanceException("Don't have sufficient fund to transfer.");
		}
	}

}
