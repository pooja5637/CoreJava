package com.revision.core.Polymorphism;

class Parent10 {

	public void m1(int... x) {
		System.out.println("Parent");
	}
}

class Child10 extends Parent10{
	
	// It is overloading but not overriding because arg-types are not same.
	public void m1(int x) {
		System.out.println("child");
	}
}

public class Main{
	public static void main(String[] args) {
		
		Parent10 p = new Parent10();
		p.m1(10); // parent
		
		Child10 c = new Child10();
		c.m1(10); // child
		
		Parent10 p1 = new Child10();
		p1.m1(10); // parent-> this is example of overloading so compiler is responsible for method resolution.
	}
	
}