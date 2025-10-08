package com.coreJava.streamAPI.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String ch = "anupam";
		Character cha = ch.chars().mapToObj(c -> (char) c).filter(c -> ch.indexOf(c) == ch.lastIndexOf(c)).findFirst().orElse(null);
		ch.chars().mapToObj(c -> (char) c).filter(c -> ch.indexOf(c) == ch.lastIndexOf(c)).findFirst().ifPresent(System.out::println);
		
		System.out.println(cha);
	}

}
