package com.coreJava.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondHighestSalary {

	public static void main(String[] args) {
		List<Integer> salary = Arrays.asList(231000,34354,1000,43563,689879);
		Integer secondHighest1 = salary.stream().distinct().sorted((a,b) -> b - a).skip(1).max((a,b) -> a.compareTo(b)).get();
		Integer secondHighest2 = salary.stream().distinct().sorted((a,b) -> b - a).skip(1).findFirst().get();
		System.out.println(secondHighest1);
		System.out.println(secondHighest2);
	}

}
