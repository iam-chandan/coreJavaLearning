package com.coreJava.string;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Kodewala";
		
		System.out.println("Number of character is (using length())  : " + str.length());
		
		char[] ch = str.toCharArray();
		System.out.println("Number of character is (using array) : " + ch.length);
		
		
		System.out.println("unique characters : " + countUniqueChar(ch));
	}
	static int countUniqueChar(char[] ch) {
		int count = 0;
		for(int i = 0;i < ch.length-1;i++) {	
			for(int j = i + 1;j < ch.length;j++) {
				if(ch[i] ==ch[j]) {
					count++;
				}
			}
		}
		return (ch.length - count);
	}

}
