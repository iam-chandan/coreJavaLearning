package com.coreJava.threads;


class Task{
	synchronized void printEven() {
		for(int i = 0;i < 10;i++) {
			if(i % 2 == 0) {
				System.out.println(i + " is even" + " & current thread " + Thread.currentThread().getName());
			}
		}
	}
	
	synchronized void printOdd() {
		for(int i = 0;i < 10;i++) {
			if(i % 2 != 0) {
				System.out.println(i + " is odd" + " & current thread " + Thread.currentThread().getName());
			}
		}
	}
}
 
class EvenPrint extends Thread{
	
	private Task task;
	
	public EvenPrint(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		task.printEven(); // calling method . Trying to get lock .. waiting
	}
	
}

class OddPrint extends Thread{
	private Task task;
	
	
	public OddPrint(Task task) {
		super();
		this.task = task;
	}


	@Override
	public void run() {
	
		task.printOdd(); // lock taken by odd thread .. remaining lock : 0
	}
	
	
}


public class EvenAndOdd {
	public static void main(String[] args) {
		Task task1 = new Task();
		Task task2 = new Task();
		
		EvenPrint even1 = new EvenPrint(task1);
		even1.setName("EVEN");
		even1.start();
		
		OddPrint odd1 = new OddPrint(task2);
		odd1.setName("ODD");
		odd1.start();
		
		EvenPrint even2 = new EvenPrint(task2);
		even2.setName("EVEN");
		even2.start();
		
		OddPrint odd2 = new OddPrint(task1);
		odd2.setName("ODD");
		odd2.start();
	}
}
