package com.coreJava.exceptionHandling.customException;

public class InsufficientBalanceException extends RuntimeException{
	InsufficientBalanceException(String message){
		super(message);
	}

}
