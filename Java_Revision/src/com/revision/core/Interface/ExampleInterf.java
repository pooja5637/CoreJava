package com.revision.core.Interface;

public interface ExampleInterf {
	
	public abstract void div(int a, int b);
	
	public default void add(int a, int b) {
		System.out.println("ans by default method:" + (a+b));
	}
	
	public static void mul(int a, int b) {
		System.out.println("ans by static method:" + (a*b));

	}

	
	

}
