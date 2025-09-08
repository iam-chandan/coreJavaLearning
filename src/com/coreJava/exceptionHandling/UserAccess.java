package com.coreJava.exceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class UserAccess {
	String getAccess() {
		String name = null;
		try {
			System.out.println("Inside try!!!");
			name = "abhijit";
			File file = new File("C:\\Desktop\\data.txt");
			FileReader fr = new FileReader(file);
			int data = fr.read();
			name.length();	
			return name;
		}catch(IOException | NullPointerException | ArithmeticException  e) {
			System.out.println("Inside catech!!!!!");
		}finally {
			System.out.println("Inside finally!!!");
			return name;
		}
	}
}
