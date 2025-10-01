package com.coreJava.streamAPI;

import java.util.Arrays;
import java.util.List;

public class FindElementMoreThan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = Arrays.asList("abhijit","ram","tushar","abhijit","swarna","siva","digvijay","raj","amit","swarna");
		List<String> lengthEqualAndMoreThan5 = str.stream().distinct().filter(st -> st.length() >= 5).toList();
		System.out.println(lengthEqualAndMoreThan5);
	}

}
