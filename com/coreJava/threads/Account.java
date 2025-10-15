package com.coreJava.threads;

import javax.security.auth.login.AccountException;

class Phonepay extends Thread {
	Account acc;

	public Phonepay(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		acc = new Account();
		acc.funTransfer(8000);
	}

}

class Googlepay extends Thread {
	Account acc;

	public Googlepay(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		Account acc = new Account();

	}

}

public class Account {
	static int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public Account() {
		super();
	}

	public static void funTransfer(int amount) {
		synchronized (Account.class) {
			System.out.println("current thread : " + Thread.currentThread().getName());
			try {
				if (amount > 0) {

					balance += amount;

					System.out.println("current balance " + balance);

				} else {
					System.out.println("you have low balance..");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
