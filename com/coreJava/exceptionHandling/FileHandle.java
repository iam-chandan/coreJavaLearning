package com.coreJava.exceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandle {
	void checkFile() {
		try {
			System.out.println("checking file");
			FileWriter wr = new FileWriter("C:\\desktop\\data.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("file checking finished");
	}
}
