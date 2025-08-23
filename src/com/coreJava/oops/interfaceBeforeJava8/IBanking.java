package com.coreJava.oops.interfaceBeforeJava8;

public interface IBanking {
	public static final int MIN_DISCOUNT = 5; //it is not a instance variable
	int MAX_DISCOUNT = 6; //by default it is considered as public static final
	abstract void pay(); //abstract method
	public abstract void settle(); //abstract method
	void cancelCheque(); //all the methods are public abstract by default
	void stopPayment();
	void doRTGSPayment();	
}



