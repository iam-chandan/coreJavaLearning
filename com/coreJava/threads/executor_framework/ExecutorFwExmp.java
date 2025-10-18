package com.coreJava.threads.executor_framework;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("current thread : " + Thread.currentThread().getName());
	}
}

class Payment implements Callable<String>{

	@Override
	public String call() throws Exception {
		System.out.println("current thread : " + Thread.currentThread().getName());
		return "payment successfull!!";
	}
	
}

public class ExecutorFwExmp {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(5);
//		ExecutorService service = Executors.newSingleThreadExecutor();
//		ExecutorService service = Executors.newCachedThreadPool();
		
		MyThread myThread = new MyThread();
		Payment payment = new Payment();
		
		for (int i = 0; i < 5; i++) {
			Future<String> future = service.submit(payment);
			try {
				System.out.println(future.get());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
