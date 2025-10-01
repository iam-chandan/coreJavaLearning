package com.coreJava.oops.interfaceBeforeJava8;

public class IDBIBank implements IBanking{

	@Override
	public void pay() {
		System.out.println("IDBIBank.pay()");
	}

	@Override
	public void settle() {
		System.out.println("IDBIBank.settle()");
	}

	@Override
	public void cancelCheque() {
		System.out.println("IDBIBank.cancelCheque()");
	}

	@Override
	public void stopPayment() {
		System.out.println("IDBIBank.stopPayment()");
	}

	@Override
	public void doRTGSPayment() {
		System.out.println("IDBIBank.doRTGSPayment()");
	}
	
}
