package com.coreJava.oops.polymorphism;

class Person {
	public void walking() {
		System.out.println("Person.walking() "+this.getClass().getName());
	}
	public void eating() {
		System.out.println("Person.eating()");
	}
}

class Ajay extends Person{
//	public void walking() {
//		System.out.println("Ajay.walking()");
//	}
	public void eating() {
		System.out.println("Ajay.eating()  "+super.getClass().getName());
	}
}

