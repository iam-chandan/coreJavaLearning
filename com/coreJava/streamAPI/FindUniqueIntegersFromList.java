package com.coreJava.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindUniqueIntegersFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = Arrays.asList(1,2,4,5,1,2,4,83,58,5,8,58,5,6,4,9,7,9);
		List<Integer> dist = num.stream().distinct().collect(Collectors.toList());
		System.out.println(dist);
	}

}
