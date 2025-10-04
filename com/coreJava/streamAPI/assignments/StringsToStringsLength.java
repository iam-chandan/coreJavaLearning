package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsToStringsLength {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("bangalore","mumbai","hyderabad","chennai","bhubaneswar","berhampur","delhi");
		List<Integer> strLen = str.stream().map(ele -> ele.length()).collect(Collectors.toList());
		System.out.println(strLen);
	}

}
