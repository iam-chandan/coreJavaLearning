package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;

public class CountEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = Arrays.asList(5,8,9,6,7,2,3,7,45,12,48,78,75);
		long even = num.stream().filter(n -> n % 2 == 0).count();
		System.out.println(even );
	}

}
