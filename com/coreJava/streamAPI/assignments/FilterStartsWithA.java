package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStartsWithA {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("abhijit","aniket","amit","swarna","tusar");
		List<String> sta = str.stream().filter(ele -> ele.startsWith("a")).collect(Collectors.toList());
		System.out.println(sta);
	}

}
