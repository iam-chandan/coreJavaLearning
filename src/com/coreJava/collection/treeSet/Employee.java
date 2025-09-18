package com.coreJava.collection.treeSet;

public class Employee implements Comparable<Employee>{
	
	String name;
	
	public Employee(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

}
