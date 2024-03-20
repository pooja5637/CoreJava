package com.revision.core.Polymorphism;

public class Parent2 {

	// if the parent class metho dis final , we can't override it.
	
	public final void m1() {
		
	}
}


class Child2 extends Parent2{
	// public void m1(); // C.E --> Cannot override final method from Parent2
}