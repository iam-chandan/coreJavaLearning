package com.coreJava.collection.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Driver {

	public static void main(String[] args) {
		LinkedHashSet<String> cityList = new LinkedHashSet<String>();
		
		cityList.add("blr");
		cityList.add("hyd");
		cityList.add("chn");
		cityList.add("pune");
		cityList.add("mumbai");
		cityList.add("vizag");
		cityList.add("bam");
		System.out.println(cityList );
		
	    Iterator<String> itr = cityList.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	}

}
