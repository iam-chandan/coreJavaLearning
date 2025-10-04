package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;

public class ListOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = Arrays.asList(5,8,9,6,7,7,45,12,48,78,75);
		List<Integer> odd = num.stream().filter(n -> n % 2 != 0).toList();
		System.out.println(odd);
	}

}
