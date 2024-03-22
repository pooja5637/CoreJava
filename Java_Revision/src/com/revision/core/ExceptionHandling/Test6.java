package com.revision.core.ExceptionHandling;

public class Test6 {

	static void validate(int age) {
		
		if(age < 18) {
			
				throw new ArithmeticException(" not valid");
	
		}
	}
	public static void main(String[] args) {

		validate(13);
		System.out.println("rest of the code");// this line will not execute if exception occurs

	}

}
