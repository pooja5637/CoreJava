package com.revision.core.AccessModifiers.pack1;

public final class FinalModifier {
	
	/*
	 * final class cannot contain abstract methods*/
	
	//public abstract void m1(); // invalid.

}


abstract class A1{
	
	public final void m1() {
		// valid --> abstract class can contain final method.
	}
}