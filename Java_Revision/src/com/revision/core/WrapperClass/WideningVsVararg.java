package com.revision.core.WrapperClass;

// widening dominates var-arg method

public class WideningVsVararg {
	
	public static void m1(int... x) {
		System.out.println("Var-arg method");
	}
	
	public static void m1(long l) {
		System.out.println("widening");
	}
	public static void main(String[] args) {
		
		int x = 10;
		m1(x);
		

	}

}
