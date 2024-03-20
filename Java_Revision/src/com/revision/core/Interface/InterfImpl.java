package com.revision.core.Interface;

public class InterfImpl implements Interf{

	/*
	 * While implementing interface into child class, compulsory method should be declared as public.
	 * because while overriding we can't reduce the scope of modifiers.*/

	@Override
	public void m1() {
		
		System.out.println("m1 method");
		
}
	@Override
	public void m2() {
		System.out.println("m2 method");

	}

}
