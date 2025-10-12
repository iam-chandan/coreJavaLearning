package com.coreJava.threads;

class Race implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Race.run() current thread name: " + Thread.currentThread().getName());
		
		receStart();
		raceEnd();
	}
	
	private void receStart() {
		System.out.println("Race started");
	}
	
	private void raceEnd() {
		System.out.println("Race Ended");
	}
	
}

public class Driver2 {
	public static void main(String[] args) {
		Race race = new Race();
		Thread t1 = new Thread(race);
		Thread t2 = new Thread(race);
		Thread t3 = new Thread(race);
		Thread t4 = new Thread(race);
		
		System.out.println("current thread state : " +t1.getState());
		t1.start();
		System.out.println("current thread state : " +t1.getState());
		
		System.out.println("current thread state : " +t2.getState());
		t2.start();
		System.out.println("current thread state : " +t2.getState());
		
		System.out.println("current thread state : " +t3.getState());
		t3.start();
		System.out.println("current thread state : " +t3.getState());
		
		System.out.println("current thread state : " +t4.getState());
		t4.start();
		System.out.println("current thread state : " +t4.getState());
		
		
		
		
	}
}
