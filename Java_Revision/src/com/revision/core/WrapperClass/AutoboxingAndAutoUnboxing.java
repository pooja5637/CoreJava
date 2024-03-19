package com.revision.core.WrapperClass;

public class AutoboxingAndAutoUnboxing {

	static Integer I = 10; // primitive to wrapper [autoboxing]

	public static void main(String[] args) {
		
		int i = I ; //  wrapper to primitive  [autounboxing]
		m1(i); // primitive to wrapper [autoboxing]
	}

	public static void m1(Integer K) {
		int m = K; //  wrapper to primitive  [autounboxing]
		System.out.println(m);
	}
}
