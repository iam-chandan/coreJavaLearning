package com.coreJava.threads;

class RunAndStartExmp extends Thread{
	public void run() {
		System.out.println("Current thread : " + Thread.currentThread().getName());
	}
	
}

public class RunVsStart {
	public static void main(String[] args) {
		RunAndStartExmp t1 = new RunAndStartExmp();
		t1.start();
		
		
		RunAndStartExmp t2 = new RunAndStartExmp();
		t2.run();
	}
}
