package com.coreJava.threads;

public class Driver3 {
	public static void main(String[] args) {
		AccountMgmt account = new AccountMgmt();
		
		FundTransfer ft1 = new FundTransfer(account);
		ft1.setName("ft1");
		ft1.start();
		
		FundTransfer ft2 = new FundTransfer(account);
		ft2.setName("ft2");
		ft2.start();
		FundTransfer ft3 = new FundTransfer(account);
		ft3.setName("ft3");
		ft3.start();
		
		FundTransfer ft4 = new FundTransfer(account);
		ft4.setName("ft4");
		ft4.start();
	}
}
