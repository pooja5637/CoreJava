package com.revision.core.ExceptionHandling;

public class Test1 {

	public static void main(String[] args) {


		
		try {
			System.out.println(10 / 0);
		}
		catch(ArithmeticException e) {

			e.printStackTrace(); //java.lang.ArithmeticException: / by zero
			//at Java_Revision/com.revision.core.ExceptionHandling.Test1.main(Test1.java:10)
			
			
			System.out.println(e);//java.lang.ArithmeticException: / by zero
			
			System.out.println(e.getMessage()); /// by zero
		}
		
	}

}
