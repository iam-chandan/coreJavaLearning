package com.coreJava.collection.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		TreeSet<String> cityList = new TreeSet<String>();
		
		cityList.add("bangalore");
		cityList.add("Mumbai");
		cityList.add("Berhampur");
		cityList.add("bbsr");
		cityList.add("Vizag");
		cityList.add("hyderabad");
		cityList.add("Chennai");
		
		System.out.println(cityList); //[Berhampur, Chennai, Mumbai, Vizag, bangalore, bbsr, hyderabad]
		
		TreeSet<Employee> empList = new TreeSet<Employee>();
		
		empList.add(new Employee("abhijit"));
		empList.add(new Employee("swarna"));
		empList.add(new Employee("siva"));
		empList.add(new Employee("raj"));
		empList.add(new Employee("tusar"));
		empList.add(new Employee("jintu"));
		//System.out.println(empList);// without inheriting comparable output is :-> java.lang.ClassCastException: gives
		//System.out.println(empList);// comparing only object output : [com.coreJava.collection.treeSet.Employee@4517d9a3]
//		System.out.println(empList);// comparing object content output : [com.coreJava.collection.treeSet.Employee@4517d9a3, com.coreJava.collection.treeSet.Employee@372f7a8d]
		
		Iterator<Employee> emp = empList.iterator();
		while(emp.hasNext()) {
			System.out.println(emp.next());
		}
	}

}
