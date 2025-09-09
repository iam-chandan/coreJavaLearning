package com.coreJava.collection.list.arraylist;

import java.util.ArrayList;

public class ComapniesList {

	public static void main(String[] args) {
		ArrayList<String> companies = new ArrayList<String>();
		
		companies.add("nvidia");
		companies.add("google");
		companies.add("orcale");
		companies.add("apple");
		companies.add(null);
		companies.add("apple");
		companies.add("apple");
		companies.add("meta");
		companies.add("sole.ai");
		companies.add("nvidia");
		companies.add(null);
		companies.add("meta");
		
		System.out.println(companies);
		
	}

}
