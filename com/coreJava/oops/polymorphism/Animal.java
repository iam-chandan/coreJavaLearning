package com.coreJava.oops.polymorphism;

public class Animal {
	public Animal eating() {
		System.out.println("Animal.eating()");
		return new Animal();
	}
}

class Dog extends Animal{
	public Dog eating() {
		System.out.println("Animal.eating()");
		return new Dog();
	}
}