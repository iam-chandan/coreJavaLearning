package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterOnlyPrimeNumbers {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(5,8,9,6,7,2,3,7,45,12,48,78,75);
		List<Integer> numArr = num.stream().filter(n -> n > 1 && IntStream.range(2,n).noneMatch(i -> n % i == 0)).collect(Collectors.toList());
		System.out.println(numArr);
	}
}
