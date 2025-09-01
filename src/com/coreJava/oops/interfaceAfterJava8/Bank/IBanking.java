package com.coreJava.oops.interfaceAfterJava8.Bank;

public interface IBanking {
	abstract void pay();
	void settle();
	void cancelChque();
	void stopPaayment();
	void doRTGSPayment(boolean flag);
	default void applyKcc() {
		
	}
	public static void printPassbook() {
		findPrinter();
		connectPrinter();
		System.out.println("passbook business logic");
		doPrint();
	}
	
	public static void printReceipt() {
		findPrinter();
		connectPrinter();
		System.out.println("receipt business logic");
		doPrint();
	}
	
	private static void findPrinter() {
		System.out.println("find printer");
	}
	private static void connectPrinter() {
		System.out.println("connect prineter");
	}
	private static void doPrint() {
		System.out.println("start printing");
	}
}
