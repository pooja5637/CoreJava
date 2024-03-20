package com.revision.core.Polymorphism;

public class Parent7 {

	public void m1() {}
	
}

class Child7 extends Parent7{
	@Override
	public void m1() {}
	
	public static void main(String[] args) {
		Parent7 p = new Child7();
		
		p.m1();// child method will be execute because parent reference can be used to hold child object and in method overriding method resolution always takes care by runtime obj[JVM].
	}
}