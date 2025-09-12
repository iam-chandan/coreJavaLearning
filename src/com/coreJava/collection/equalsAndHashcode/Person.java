package com.coreJava.collection.equalsAndHashcode;

class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		return this.name.equals(person.name);
	}
	
	public int hashCode() {
		return this.name.hashCode();
	}
}

