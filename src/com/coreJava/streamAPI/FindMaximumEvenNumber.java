package com.coreJava.streamAPI;

import java.util.Arrays;
import java.util.List;

public class FindMaximumEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = Arrays.asList(2,8,5,9,6,75,15,42,48,3,4);
		int maximum = num.stream().filter(n -> n%2 == 0).max((a,b) -> a.compareTo(b)).get(); // max() will give return type optional
		int minimum = num.stream().filter(n -> n%2 == 0).min((a,b) -> a.compareTo(b)).get(); // max() will give return type optional
		System.out.println("maximum : " + maximum + " minimum : " + minimum);
	}

}
