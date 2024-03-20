package com.revision.core.Polymorphism;

// In overloading, method resolution always takes care by compiler based on reference type.
// In overloading JVM is not responsible for method resolution.
public class Example1 {

	public void m1(int i) {
		System.out.println("int-arg");
	}
	
	public void m1(float f) {
		System.out.println("float-arg");
	}
	public static void main(String[] args) {

		Example1 t = new Example1();
		
		t.m1(10); //int-arg

		t.m1(10.5f); //float-arg

		t.m1('a'); //int-arg --> type promotion char->int
		
		t.m1(10L); //float-arg --> type promotion long -> float
		
	}

}
