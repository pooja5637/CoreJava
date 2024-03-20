package com.revision.core.Polymorphism;

public class Parent5 {

	// while overriding we cannot reduce the scope of access modifier but we can increase the scope.
	
	// private < default < protected < public
	
	public void m1() {
		
	}
}


class Child5 extends Parent5{
//	void m1() {// C.E. -> cannot reduce visibility of inherited method from Parent5
		
//	}
	
}