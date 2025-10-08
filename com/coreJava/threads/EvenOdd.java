package com.coreJava.threads;

class Even extends Thread{
	public void run() {
		for(int i = 1;i <= 10;i++) {
			if(i % 2 == 0) {
				System.out.println(i + " is even");
			}
		}
	}
}

class Odd extends Thread{
	public void run() {
		for(int i = 1;i <= 10;i++) {
			if(i % 2 != 0) {
				System.out.println(i + " is odd");
			}
		}
	}
}

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("main() START");
		Even even = new Even();
		even.setName("even number");
		even.start();
		
		Odd odd = new Odd();
		odd.setName("odd number");
		odd.start();
		
		System.out.println("main() END");
	}
}
