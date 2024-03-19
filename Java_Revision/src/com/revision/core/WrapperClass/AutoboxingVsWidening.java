package com.revision.core.WrapperClass;

// widening dominates autoboxing

public class AutoboxingVsWidening {

	public static void m1(Integer I) {
		System.out.println("Autoboxing");
	}
	
	public static void m1(long l) {
		System.out.println("widening");
	}
	public static void main(String[] args) {

		int x = 10 ;
		m1(x);
	}

}
