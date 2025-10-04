package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindLongetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = Arrays.asList("apple","orange","watermilon","guava","banana");
		Optional<String> largestString = fruits.stream().max((a,b) -> a.length() - b.length());
		System.out.println(largestString);
	}

}
