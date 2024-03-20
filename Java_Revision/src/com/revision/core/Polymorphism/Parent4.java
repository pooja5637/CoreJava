package com.revision.core.Polymorphism;

public class Parent4 {
	/*
	 * Can we override non-abstract method as abstract method?
	 * 		Yes, main adv. of this approach is we can stop the availability of parent method implementation to the next level child classes.*/
	
	public void m1() {
		
	}

}


abstract class Child4 extends Parent4{
	
	@Override
	public abstract void m1();
	// child class is responsible to implement abstract class implementation.
}