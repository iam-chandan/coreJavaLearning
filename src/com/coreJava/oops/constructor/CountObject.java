package com.coreJava.oops.constructor;

class Car{
	static int count;
	static int cnt;
	String name;
	
	static{
		cnt++;
		System.out.println(cnt);
	}
	
	{
		count++;
		System.out.println("count : " + count);
	}
	
	{
		count++;
		System.out.println("count : " + count);
	}
	
	public Car() {
		this("BMW");
		System.out.println("Car constructor");
	}
	
	public Car(String name) {
		System.out.println(name);
	}
	
}

public class CountObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 =  new Car();
//		Car c2 =  new Car();
//		Car c3 =  new Car();
//		Car c4 =  new Car();
//		Car c5 =  new Car();
//		Car c6 =  new Car();
//		Car c7 =  new Car();
//		Car c8 =  new Car();
		System.out.println(Car.cnt + " no. of objects created(static initialization block).");
		System.out.println(Car.count + " no. of objects created(instance initialization block).");
	}

}
