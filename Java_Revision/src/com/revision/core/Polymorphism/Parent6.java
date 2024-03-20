package com.revision.core.Polymorphism;


// eg. overriding with respect to static method
/*
 * We cannot override a static method as non static method. Otherwise we will get compile time error*/

public class Parent6 {

	public static void m1() {
		}
}


class Child6 extends Parent6{
//static method is class level & instance method is object level.
// so , we cant override object level with class level.
	
//	@Override
//	public void m1() {
//		
//	}
}