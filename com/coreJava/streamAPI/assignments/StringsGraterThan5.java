package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;

public class StringsGraterThan5 {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("abhijit","siva","amit","swarna","tusar","chinmay","sachin");
		List<String> filStr = str.stream().filter(s -> s.length() > 5).toList();
		System.out.println(filStr);
	}

}
