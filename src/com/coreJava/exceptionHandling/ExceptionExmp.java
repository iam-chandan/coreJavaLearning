package com.coreJava.exceptionHandling;

public class ExceptionExmp {
	public static void pay() {
		String name = null;
		try {
			System.out.println("length of name :");
			System.out.println(name.length());
		}catch(Exception e) {
			System.out.println("null pointer exception handeled");
		}
		System.out.println("Exception example.");
	}
}
