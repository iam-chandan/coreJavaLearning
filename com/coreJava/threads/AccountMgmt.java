package com.coreJava.threads;

import java.util.concurrent.locks.ReentrantLock;

class FundTransfer extends Thread{
	
	 AccountMgmt account;
	 
	 public FundTransfer(AccountMgmt account) {
		 this.account = account;
	 }
	
	@Override
	public void run() {
		account.fundTransfer();
	}
}

public class AccountMgmt {
	ReentrantLock reentrantLock = new ReentrantLock();
	
	public void fundTransfer() {
		reentrantLock.lock();
		for(int i = 0;i < 5;i++) {
			System.out.println(i + " current thread : " + Thread.currentThread().getName());
		}
		reentrantLock.unlock();
	}
}
