package com.coreJava.threads;

public class SynchronizedExmp {
	public static void main(String[] args) {
		Account c = new Account();
		
		Googlepay gp = new Googlepay(c);
		gp.start();
		
		Phonepay pp1 = new Phonepay(c);
		pp1.start();
		
		Phonepay pp2 = new Phonepay(c);
		pp2.start();
		
		Phonepay pp3 = new Phonepay(c);
		pp3.start();
		
		Phonepay pp4 = new Phonepay(c);
		pp4.start();
		
		Phonepay pp5 = new Phonepay(c);
		pp5.start();
	}
}
