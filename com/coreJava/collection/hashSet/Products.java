package com.coreJava.collection.hashSet;

import java.util.HashSet;

public class Products {

	public static void main(String[] args) {
		HashSet<String> product =  new HashSet<String>();
		
		product.add("samsung s25");
		product.add("samsung s24");
		product.add("iphone 16");
		product.add("iphone 16 pro max");
		product.add("moto");
		product.add("nokia");
		product.add("mi note 15");
		product.add("realme");
		product.add("poco");
		product.add("viovo");
		product.add("oppo");
		product.add("iqoo");
		System.out.println(product);
		product.add("samsung s25 ultra");
		
	}

}
