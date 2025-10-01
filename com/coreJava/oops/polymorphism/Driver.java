package com.coreJava.oops.polymorphism;

public class Driver {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.walking();
		p1.eating();
		
		Person p2 = new Ajay();
		p2.walking();
		p2.eating();
		
		System.out.println("*******************");
		Animal animal = new Animal();
		System.out.println(animal.eating());
		
		Dog dog = new Dog();
		System.out.println(dog.eating());
	}
}
