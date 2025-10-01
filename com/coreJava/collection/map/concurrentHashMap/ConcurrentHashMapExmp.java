package com.coreJava.collection.map.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExmp {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<String, String>();
		chm.put("koarnataka", "blr");
		chm.put("odisha", "bbsr");
		chm.put("telengana", "hyd");
		chm.put("tamilnadu", "chennai");
		chm.put("maharastra", "mumbai");
		chm.put("rajasthan", "jaipur");
		chm.put("up", "lucknow");
		chm.put("mp", "bhopal");
		System.out.println(chm);
	}

}
