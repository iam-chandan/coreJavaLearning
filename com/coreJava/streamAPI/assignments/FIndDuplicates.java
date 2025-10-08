package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FIndDuplicates {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(7,8,5,7,9,2,9,6,4,3,7,5,9,2);
		Set<Integer> set = new HashSet<Integer>();
		Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(n -> set.add(n),Collectors.toList()));
		Set<Integer> duplicate = list.stream().filter(n -> !set.add(n)).collect(Collectors.toSet());
		System.out.println(map);
		System.out.println(duplicate);
	}

}
