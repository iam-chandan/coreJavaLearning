package com.coreJava.oops.interfaceAfterJava8.functionalInterface;

@FunctionalInterface
public interface IPayment {
	public abstract void pay();
//	public abstract void settle();
	
	public default void test() {
		
	}
	
	public static void pass() {
		
	}
}
