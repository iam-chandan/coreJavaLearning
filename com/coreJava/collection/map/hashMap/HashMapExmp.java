package com.coreJava.collection.map.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExmp {

	public static void main(String[] args) {
		HashMap<String, String> stateAndCapital =  new HashMap<String, String>();
		
		stateAndCapital.put("odisha", "BBSR");
		stateAndCapital.put("karnataka", "BLR");
		stateAndCapital.put("maharastra", "Mumbai");
		stateAndCapital.put("telengana", "HYD");
		stateAndCapital.put("Tamilnadu", "chennai");
		stateAndCapital.put("rajasthan", "jaipur");
		
		Set<Entry<String,String>> entry = stateAndCapital.entrySet();
		
		Iterator<Entry<String,String>> itr = entry.iterator();
		
		while(itr.hasNext()) {
			
			Entry<String,String> as = itr.next();
			
			System.out.println("key : " + as.getKey() + " value : " + as.getValue());
			stateAndCapital.put("wb", "kolkata");
		}

	}

}
