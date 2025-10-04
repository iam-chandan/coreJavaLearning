package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;

public class SalaryGraterThan {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"abijit",45000);
		Employee e2 = new Employee(102,"swarna",50000);
		Employee e3 = new Employee(103,"tusar",65000);
		Employee e4 = new Employee(104,"chinmay",58000);
		Employee e5 = new Employee(105,"sachin",75000);
		
		List<Employee> emp = Arrays.asList(e1,e2,e3,e4,e5);
		List<Employee> salary = emp.stream().filter(e -> e.getSalary() > 50000).toList();
		System.out.println(salary);
	}

}
