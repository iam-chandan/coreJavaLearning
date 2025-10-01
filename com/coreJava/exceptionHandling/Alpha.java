package com.coreJava.exceptionHandling;

public class Alpha {

	public static void main(String[] args) {
//		Mathmatics math = new Mathmatics();
//		math.calLength();
		String name = null;
		
//		System.out.println("********************");
//		FileHandle fh = new FileHandle();
//		fh.checkFile();
//		
//		System.out.println("********************");
		
		String[] str = {"apple","orange","banana","grapes","pomogranate"};
		try {
			name.length();
			int i = 10/0;
			System.out.println(str[6]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
