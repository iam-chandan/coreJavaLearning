package com.coreJava.oops.interfaceBeforeJava8;

public class HDFCBank implements IBanking{

	@Override
	public void pay() {
		System.out.println("HDFC.pay()");
	}

	@Override
	public void settle() {
		System.out.println("HDFC.settle()");
	}

	@Override
	public void cancelCheque() {
		System.out.println("HDFC.cancelCheque()");
	}

	@Override
	public void stopPayment() {
		System.out.println("HDFC.stopPayment()");
	}

	@Override
	public void doRTGSPayment() {
		System.out.println("HDFC.doRTGSPayment()");
	}
	
}
