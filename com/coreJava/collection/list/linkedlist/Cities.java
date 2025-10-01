package com.coreJava.collection.list.linkedlist;

import java.util.LinkedList;

public class Cities {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Bangalore");
		ll.add("Delhi");
		ll.add("Hyderabad");
		ll.add("Mumbai");
		ll.add("BBSR");
		ll.add("Vizag");
		ll.add("Kolkata");
		ll.add("Chennai");
		ll.add("Pune");
		
		System.out.println("Before : " + ll);
		ll.add(2, "Kochi");
		System.out.println("After : " + ll);
	}

}
