package com.coreJava.oops.constructor;

public class Employee {
	String name;
	int empId;
	
	public Employee() {
		this("Ram",102);
		System.out.println("employee");
	}
	
	public Employee(String name,int empId) {
		this.name = name;
		this.empId = empId;
		System.out.println("name : " + name + ", employrr id : " + empId);
	}
}

class Manager extends Employee{
	String department;
	
	public Manager() {
		this("development");
		System.out.println("meneger");
	}
	
	public Manager(String department) {
		super("Abhijit",101);
		this.department = department;
		System.out.println("department : " + department);
	}
}
