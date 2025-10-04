package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfPhoneNumbers {

	public static void main(String[] args) {
		Users u1 = new Users(101,"abhijit",4578963212l);
		Users u2 = new Users(102,"swarna",5247896521l);
		Users u3 = new Users(103,"chinmay",7854963215l);
		Users u4 = new Users(104,"tusar",8457963215l);
		Users u5 = new Users(105,"sachin",9586471235l);
		
		List<Users> user = Arrays.asList(u1,u2,u3,u4,u5);
		List<Long> mobile = user.stream().map(ele -> ele.getMobile()).collect(Collectors.toList());
		System.out.println(mobile);
	}

}
