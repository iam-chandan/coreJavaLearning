package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenIntoASingleList {

	public static void main(String[] args) {
		List<List<Integer>> num = Arrays.asList(Arrays.asList(4,5,2,7),Arrays.asList(8,7,5,9),Arrays.asList(4,6,8,9,5,2));
		List<Integer> fl = num.stream().flatMap(ele -> ele.stream()).distinct().collect(Collectors.toList());
		System.out.println(fl);
	}
}
