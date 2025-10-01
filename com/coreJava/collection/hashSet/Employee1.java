package com.coreJava.collection.hashSet;

public class Employee1 {
	String name;
	public Employee1(String name) {
		this.name =  name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return this.name.equals(((Employee1)(obj)).name);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
