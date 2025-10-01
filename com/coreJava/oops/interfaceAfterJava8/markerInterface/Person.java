package com.coreJava.oops.interfaceAfterJava8.markerInterface;

import java.io.Serializable;

public class Person implements Serializable{
	public String firstName;
	public String lastName;
	
	public Person(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

