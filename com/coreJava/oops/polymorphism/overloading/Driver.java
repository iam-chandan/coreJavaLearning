package com.coreJava.oops.polymorphism.overloading;

public class Driver {

	public static void main(String[] args) {
		UserLogin login = new UserLogin();
		login.doLogin(852479631l, 8524);
		login.doLogin("8524793145223456", 7569);
		login.doLogin("demo@gmail.com", "demo@123");
		login.doLogin("demo", "demo@123", 7542);
	}

}
