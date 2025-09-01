package com.coreJava.oops.interfaceAfterJava8.markerInterface;

public class Employee implements Cloneable{
	
	public int id;
	public String name;
	
	protected Object clone() throws CloneNotSupportedException{ //it should be protected
			return super.clone();
		
	}
	
	public Employee(int id,String name) {
		this.id = id;
		this.name = name;
	}
}
