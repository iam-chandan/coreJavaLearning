package com.coreJava.string;

public class Paragraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="I am from Bangalore karnataka";
		String arr[] = str.split(" ");
		System.out.println("with space : " + str.length());
		int count = countCharacter(str);
		System.out.println("without space : " + count);
		printStringArray(arr);
		System.out.println("number words is : " + count+1);
		
	}
	static int countCharacter(String str) {
		int count = 0;
		for(int i = 0;i < str.length();i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		return (str.length() - count);
	}
	static void printStringArray(String[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.println("index " + i + " = " + arr[i]);
		}
		System.out.println();
	}

}
