package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = Arrays.asList("apple","orange","watermilon","guava","banana");
		Set<Character> chars = fruits.stream().flatMap(e -> e.chars().mapToObj(c -> (char)c)).collect(Collectors.toSet());
		System.out.println(chars);
	}

}
