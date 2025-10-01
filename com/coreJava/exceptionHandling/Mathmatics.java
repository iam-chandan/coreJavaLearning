package com.coreJava.exceptionHandling;

public class Mathmatics {
	void calLength() {
		String name = null;
		try {
			System.out.println("length calculation started....");
			name.length();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("calculation of length finished....");
	}
}
