package com.coreJava.collection.hashSet;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		HashSet<Person> person = new HashSet<Person>(64);
		
		person.add(new Person("abhi"));
		person.add(new Person("abhijit"));
		person.add(new Person("ravi"));
		person.add(new Person("abinash"));
		person.add(new Person("tusar"));
		person.add(new Person("ankush"));
		person.add(new Person("mukesh"));
		person.add(new Person("litu"));
		person.add(new Person("swarna"));
		person.add(new Person("siva"));
		person.add(new Person("raj"));
		System.out.println(person);

	}

}
