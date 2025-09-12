package com.coreJava.collection.equalsAndHashcode;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("rahul");
		Person p2 = new Person("rahul");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode()); 
	}

}
