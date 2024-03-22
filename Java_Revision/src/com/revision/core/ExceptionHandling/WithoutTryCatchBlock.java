package com.revision.core.ExceptionHandling;

public class WithoutTryCatchBlock {

	public static void main(String[] args) {


		// taking an array of size 4
		
		int[] arr = new int[4];
		
		// now this stmnt will cause an exception
		
		int i = arr[4]; // R.E: ArrayIndexOutOfBoundsException --> terminate program abnormally...
		
		// this stmnt will never execute as above line will caught with an exception
		
		System.out.println("Hii, I want to execute..");
	}

}
