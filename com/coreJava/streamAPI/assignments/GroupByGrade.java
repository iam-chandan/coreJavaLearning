package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students(101, "swarna", 'A');
		Students s2 = new Students(102, "abhi", 'B');
		Students s3 = new Students(103, "chinmay", 'A');
		Students s4 = new Students(104, "sachin", 'C');
		Students s5 = new Students(105, "siva", 'B');
		Students s6 = new Students(106, "raj", 'D');
		Students s7 = new Students(107, "tusar", 'B');
		
		List<Students> student = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);
		Map<Character,List<Students>> studentbyGrade = student.stream().collect(Collectors.groupingBy(s -> s.getGrad()));
		for(Map.Entry<Character, List<Students>> entry: studentbyGrade.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
