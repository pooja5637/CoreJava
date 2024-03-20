package com.revision.core.Polymorphism;


/* If both parent and child class method are static then we won't get any compile time error.*/

public class Parent9 {
	public static void m1() {
		
	}
	
}

class Child9 extends Parent9{
	
//	@Override
	public static void m1() {
		/* It seems overriding concept applicable for static methods but it is not overriding, it is method hiding */
		
		// If both parent & child class methods are non-static then it will become overriding.
	}
}
