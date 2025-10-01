package com.coreJava.streamAPI;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = Arrays.asList(1,2,7,5,8,6,3,4,12);
		List<Integer> even = num.stream().filter(n -> n % 2 == 0).map(e -> e * 10).toList();
		System.out.println(even);
	}

}
