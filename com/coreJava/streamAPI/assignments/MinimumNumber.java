package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;

public class MinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = Arrays.asList(5,8,9,6,7,7,45,12,48,78,75);
		int minimum = num.stream().min((a,b) -> a.compareTo(b)).get();
		System.out.println(minimum);
	}

}
