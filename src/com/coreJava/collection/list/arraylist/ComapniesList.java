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
		/*
		 * after adding this 2 data then from 5th index onwards all the elements move to the right index mens 5th index
		 * element move to 6th and 6th move to 7th so on till end
		 * 
		 * arraylist is goog when we know index
		 */
		companies.add(5, "adobi");
		companies.add(5, "perplexity");
		System.out.println(companies);
		
	}

}
