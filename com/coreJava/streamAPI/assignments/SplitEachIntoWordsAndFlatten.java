package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitEachIntoWordsAndFlatten {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("hello world", "this is fun", "split and flatten");
		List<String> strr = str.stream().flatMap(ele -> Arrays.stream(ele.split("\\s+"))).collect(Collectors.toList());
		System.out.println(strr);
	}

}
