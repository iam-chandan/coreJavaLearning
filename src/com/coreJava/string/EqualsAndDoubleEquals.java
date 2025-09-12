package com.coreJava.string;

public class EqualsAndDoubleEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Manjhi");
		String s2 = new String("Asish");
		String str = "Manjhi";
		
		Person p1 = new Person("Asish");
		Person p2 = new Person("Asish");
		
		String s11 = "Kodwala";
		String s12 = "Kodwala";
		s12 = s12.concat(" Academy"); //this will create in HEAP and one copy of this will save in SCP
		String s13 = "Kodwala Academy"; // this object will refer to copy of concat() method string which created above(^) line
										//	bcz already same content is present so it it wont create a new object 
		String s14 = new String("Kodwala Academy");
		System.out.println("s12 == s13 : "+s12 == s13);
		System.out.println("s12.equals(s13) : "+s12.equals(s13));
		System.out.println("s13.equals(s14) : "+s13.equals(s14));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s11);
		System.out.println(p1.equals(p2));
		System.out.println(s1.equals(str));
	}

}

/**
 * String class is final 
 */

class Person{
	String name;
	public Person(String name) {
		super();
		this.name = name;
	}
	
//	boolean equals(Person p) {
//		if(this != p) {
//			return true;
//		}
//		return false;
//	}
	public boolean equals (Object obj) {
		Person person = (Person)obj;
		return this.name.equals(person.name);
	}
}