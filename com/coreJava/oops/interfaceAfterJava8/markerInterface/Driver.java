package com.coreJava.oops.interfaceAfterJava8.markerInterface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		Employee e1 = new Employee(102586,"abhijit");
		
		Employee e2 = (Employee) e1.clone();
		System.out.println("name = " + e2.name + " ,id = "+e2.id);
		
		System.out.println(e1 instanceof Cloneable);
		
		Person p1 = new Person("abhijit","kadam");
		
		FileOutputStream fOut = new FileOutputStream("person.ser");
		ObjectOutputStream oOut = new ObjectOutputStream(fOut);
		
		oOut.writeObject(p1);
		
		FileInputStream fIn = new FileInputStream("person.ser");
		ObjectInputStream oIn = new ObjectInputStream(fIn);
		Person p2 = (Person) oIn.readObject();
		System.out.println(p2.firstName + " " + p2.lastName);
	}

}
