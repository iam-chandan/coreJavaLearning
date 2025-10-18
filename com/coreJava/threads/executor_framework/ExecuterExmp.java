package com.coreJava.threads.executor_framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterExmp {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(5);
		
		for(int i = 0;i < 5;i++) {
			service.execute(() -> System.out.println("current thread from execute() : " + Thread.currentThread().getName()));
		}
		
		Future<String> future = service.submit(() -> Thread.currentThread().getName() + "\npayment successfull!!");
		try {
			System.out.println(future.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
