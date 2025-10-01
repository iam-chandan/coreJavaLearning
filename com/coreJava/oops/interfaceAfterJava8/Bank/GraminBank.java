package com.coreJava.oops.interfaceAfterJava8.Bank;

public class GraminBank implements IBanking{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void settle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelChque() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopPaayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doRTGSPayment(boolean flag) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void applyKcc() {
		
	}

	public void printPassbook() {
		IBanking.printPassbook();
	}
	
	public void printReceipt() {
		IBanking.printReceipt();
	}
}
