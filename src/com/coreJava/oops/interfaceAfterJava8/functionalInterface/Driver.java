package com.coreJava.oops.interfaceAfterJava8.functionalInterface;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
//		IMathmatics add = (a,b)->{
//			return a+b;
//		};
		
		//without datatype
//		IMathmatics multi = (a,b)->{
//			return a*b;
//		};
		
		//with datatype
		IMathmatics multi = (int a,int b)->{
			return a*b;
		};
//		
		
//		int result = add.addition(15, 20);
//		System.out.println("sum : " + result);
		int result = multi.multiplication(12, 7);
		System.out.println("multiplication : " + result);
		
		Scanner scn = new Scanner(System.in);
		IPerson x = ()->{
			return scn.next();
		};
		System.out.println(x.setName());
	}

}
