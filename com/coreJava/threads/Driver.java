package com.coreJava.threads;


class MyFirstThread extends Thread{
	public void run() {
		System.out.println("my first thread : " + Thread.currentThread().getName());
	}
}

class MySecThread extends Thread{
	public void run() {
		System.out.println("my second thread : " + Thread.currentThread().getName());
	}
}

public class Driver {

	public static void main(String[] args) {
		System.out.println("main() START");
		String threadName = Thread.currentThread().getName();
		System.out.println("main() thread is : " + threadName);
		
		MyFirstThread t1 = new MyFirstThread();
		t1.setName("first thread");
		t1.start();
		
		MySecThread t2 = new MySecThread();
		t2.start();
		
		System.out.println("main() END");
	}

}
