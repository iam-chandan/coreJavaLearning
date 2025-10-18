package com.coreJava.threads;

class WriteAndRead {
	String message;

	public synchronized void write(String message) {
		System.out.println(Thread.currentThread().getName() + "writer thread writting started..");
		this.message = message;
		System.out.println(Thread.currentThread().getName() + "writting finished..");
		this.notify();
	}

	public synchronized void reade() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + "waiting to read the message..");
		this.wait();
		System.out.println(Thread.currentThread().getName() + message);
	}
}

class WriterThread extends Thread {
	WriteAndRead writerAndRead;

	public WriterThread(WriteAndRead writerAndRead) {
		this.writerAndRead = writerAndRead;
	}

	public void run() {
		try {
			Thread.sleep(2000);
			writerAndRead.write("How are you?.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class ReaderThread extends Thread {
	WriteAndRead writeAndRead;

	public ReaderThread(WriteAndRead writerAndRead) {
		this.writeAndRead = writerAndRead;
	}

	public void run() {
		try {
			writeAndRead.reade();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class InterThreadCommunication {
	public static void main(String[] args) {
		WriteAndRead writeAndRead = new WriteAndRead();

		WriterThread writerThread = new WriterThread(writeAndRead);
		ReaderThread readerThread = new ReaderThread(writeAndRead);

		writerThread.setName("writer thread : ");
		readerThread.setName("reader thread : ");

		writerThread.start();
		readerThread.start();
	}
}
