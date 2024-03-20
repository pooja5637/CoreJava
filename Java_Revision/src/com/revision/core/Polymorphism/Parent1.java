package com.revision.core.Polymorphism;

/* parent class private methods not available to the child hence overriding concept not applicable for private methods.*/
public class Parent1 {

	private void m1() {
	
		// parent specific method
	}

}


class Child1 extends Parent1 {

	//@Override
	private void m1() {
		// child specific method.
	}
	
	// It is valid but not overriding.
	// based on our requirement we can define exactly same private method in child class
}
