package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOutNegativeNumbers {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(5,8,-9,6,-7,2,3,7,-45,-12,48,78,-75);
		List<Integer> negative = num.stream().filter(n -> n < 0).collect(Collectors.toList());
		System.out.println(negative);
	}

}
