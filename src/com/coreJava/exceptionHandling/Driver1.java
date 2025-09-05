package com.coreJava.exceptionHandling;

public class Driver1 {

	public static void main(String[] args) {
		UserAccess access = new UserAccess();
		String name = access.getAccess();
		System.out.println(name);
	}

}
