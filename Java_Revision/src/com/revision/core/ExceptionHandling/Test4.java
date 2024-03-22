package com.revision.core.ExceptionHandling;

public class Test4 {

	static ArithmeticException e;
	public static void main(String[] args) {


		throw e ;
		
		// if e refers a null then we will get NullPointerException
	}

}
