package com.coreJava.string;

public class StringIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Bangalore";
		String s2 = new String("Bangalore");
		s2 = s2.intern();
		System.out.println(s1 == s2);
	}

}
