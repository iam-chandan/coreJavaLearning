package com.coreJava.exceptionHandling;

import java.io.IOException;

public class UserAccess {
	String getAccess() {
		String name = null;
		try {
			System.out.println("Inside try!!!");
			name = "abhijit";
			name.length();	
			return name;
		}catch( NullPointerException | ArithmeticException  e) {
			System.out.println("Inside catech!!!!!");
		}finally {
			System.out.println("Inside finally!!!");
			return name;
		}
	}
}
