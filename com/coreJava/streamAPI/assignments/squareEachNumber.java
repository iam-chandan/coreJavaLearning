package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class squareEachNumber {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(4,2,7,5,8,6,9);
		List<Integer> sqrNum = num.stream().map(ele -> ele*ele).collect(Collectors.toList());
		System.out.println(sqrNum);
	}

}
