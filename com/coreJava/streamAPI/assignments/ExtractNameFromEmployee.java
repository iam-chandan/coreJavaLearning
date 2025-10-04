package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractNameFromEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"abhijit",12000);
		Employee e2 = new Employee(102,"swarna",45000);
		Employee e3 = new Employee(103,"tusar",15000);
		Employee e4 = new Employee(104,"chinmay",75240);
		Employee e5 = new Employee(105,"sachin",63000);
		List<Employee> emp = Arrays.asList(e1,e2,e3,e4,e5);
		List<String> names = emp.stream().map(ele -> ele.getName()).collect(Collectors.toList());
		System.out.println(names);
	}

}
