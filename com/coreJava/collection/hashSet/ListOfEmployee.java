package com.coreJava.collection.hashSet;

import java.util.HashSet;

public class ListOfEmployee {

	public static void main(String[] args) {
		HashSet<Employee> listOfState = new HashSet<Employee>(64);
		
		listOfState.add(new Employee("ram"));
		listOfState.add(new Employee("abhi"));
		listOfState.add(new Employee("tusar"));
		listOfState.add(new Employee("ravi"));
		listOfState.add(new Employee("manu"));
		listOfState.add(new Employee("ankush"));
		listOfState.add(new Employee("minal"));
		listOfState.add(new Employee("suresh"));
		listOfState.add(new Employee("raghu"));
		listOfState.add(new Employee("rahul"));
		listOfState.add(new Employee("abisekh"));
		listOfState.add(new Employee("abijit"));
		
		System.out.println(listOfState);
	}

}
