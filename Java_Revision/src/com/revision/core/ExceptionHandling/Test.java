package com.revision.core.ExceptionHandling;

public class Test {

	public static void main(String[] args) {


		System.out.println(" statment 1"); // statment 1
		
		try {
			System.out.println(10 / 0); 
		}
		catch(ArithmeticException e) {
			System.out.println(10 / 2);  // 5
		}
		
		System.out.println(" stmnt 3");  // stmnt 3
	}

}
