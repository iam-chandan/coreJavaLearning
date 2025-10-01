package com.coreJava.oops.inheritance.BankingSystem;


class BankingSystem {
//	int i;
//	public BankingSystem(int i) {
//		this.i = i;
//	}
	public void pay() {
		System.out.println("pay");
	}
	public void printPassbook() {
		System.out.println("print passbook");
	}
}
public class SBIBank extends BankingSystem{
	public void printPassbook() {
		System.out.println("printed passbook in sbi");
	}
	public static void main(String[] args) {
		SBIBank  sbiBank = new SBIBank();
		/*
		 * compile time :-> printPassbook() method should be there in SBIBank(reference)
		 * at run time :-> printPassbook() method should be there in SBIBank(actual object 
		 */
		BankingSystem bankingSystem = new SBIBank();
		bankingSystem.printPassbook();
	}

}

/*
 * runtime poly-morphism or dynamic method dispatch
 * */