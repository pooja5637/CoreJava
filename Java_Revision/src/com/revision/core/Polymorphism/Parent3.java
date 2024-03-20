package com.revision.core.Polymorphism;

public abstract class Parent3 {
	
	/* Is it possible to override abstract()?
	 *		abstract method we can override as un-abstract method to provide implementation 
	 *
	 *Parent class abstract method, we should override in child class to provide implementation.*/

	public abstract void m1();
}

class child3 extends Parent3{
	
	@Override
	public void m1() {}
	
}
