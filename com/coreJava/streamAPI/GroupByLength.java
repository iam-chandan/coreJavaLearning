package com.coreJava.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

	public static void main(String[] args) {
		List<String> city = Arrays.asList("bangalore","Mumbai","hyd","ahm","Delhi","Mangalore","chennai");
		Map<Integer,List<String>> groupByCity = city.stream().collect(Collectors.groupingBy(n -> n.length()));
		for(Map.Entry<Integer, List<String>> ent : groupByCity.entrySet()) {
			System.out.println(ent.getKey() + " : " + ent.getValue());
		}
		
		System.out.println("****************************");
		
		groupByCity.forEach((l,d) -> System.out.println(l + " : " + d));
	}

}
