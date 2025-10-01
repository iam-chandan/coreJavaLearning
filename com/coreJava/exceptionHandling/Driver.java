package com.coreJava.exceptionHandling;

public class Driver {

	public static void main(String[] args) {
		ExceptionExmp ex = new ExceptionExmp();
		ex.pay();
		
		try {
			int num = 12/0;
			System.out.println(num);
		}catch(ArithmeticException e) {
			System.out.println("Exceptipn handeled.");
		}		
	}

}
