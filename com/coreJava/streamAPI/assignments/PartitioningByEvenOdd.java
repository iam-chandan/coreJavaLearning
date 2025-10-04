package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = Arrays.asList(5,8,9,6,7,7,45,12,48,78,75);
		Map<Boolean,List<Integer>> evenOdd = num.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
//		System.out.println("Even : " + evenOdd.get(true));
//		System.out.println("Odd : " + evenOdd.get(false));
		
		for(Map.Entry<Boolean, List<Integer>> entry : evenOdd.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
