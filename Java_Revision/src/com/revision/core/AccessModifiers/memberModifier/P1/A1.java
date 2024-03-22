package com.revision.core.AccessModifiers.memberModifier.P1;

public class A1 {

	//public method
	public void m1() {
		System.out.println("A class method");
	}
	
	//default method --> only accessible in current package , outside package not accessible.
	void m2() {}
	
//	public static void main(String[] args) {
//		A1 a = new A1();
//		
//		a.m1();
//	}
}
