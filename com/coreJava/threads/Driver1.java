package com.coreJava.threads;

class Cooking extends Thread{
	public void run() {
		System.out.println("Done with cooking...");
	}
}

class Serving extends Thread{
	public void run() {
		System.out.println("Food serving started...");
	}
}

public class Driver1 {
	public static void main(String[] args) throws InterruptedException {
		Cooking cook = new Cooking();
		cook.start();
		cook.join();
		
		Serving serve = new Serving();
		serve.start();
	}
}
