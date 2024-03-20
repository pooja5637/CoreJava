package com.revision.core.Interface;

public interface LeftDefaultInterf {
	
	default void m1() {
		System.out.println("Left default method");
	}

}
