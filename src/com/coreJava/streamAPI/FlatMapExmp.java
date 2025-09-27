package com.coreJava.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> listOfNames = Arrays.asList(Arrays.asList("abhijit","ram","tushar","swarna"),
				Arrays.asList("siva","digvijay","raj","amit")
				,Arrays.asList("santosh","anshuman","aniket"));
		
		List<String> namesGraterThan = listOfNames.stream().flatMap(lt -> lt.stream()).filter(ele -> ele.length() >= 5).collect(Collectors.toList());
		System.out.println(namesGraterThan);
		namesGraterThan.forEach(System.out::println);
	}

}
