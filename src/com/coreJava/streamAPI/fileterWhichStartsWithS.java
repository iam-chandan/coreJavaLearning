package com.coreJava.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fileterWhichStartsWithS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("samsung");
		list.add("lg");
		list.add("godrej");
		list.add("sansui");
		list.add("sony");
		
		//1. convert list to stream
		Stream<String> stream = list.stream();
		
		//2.apply the logic
		Stream<String> filteredStream = stream.filter(j -> j.startsWith("s"));
		
		//3.collect the data
		List<String> outputList = filteredStream.collect(Collectors.toList());
		
		System.out.println(outputList);

	}

}
