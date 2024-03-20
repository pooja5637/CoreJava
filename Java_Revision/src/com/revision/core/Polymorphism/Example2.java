package com.revision.core.Polymorphism;

/* while resolving overloaded methods compiler will always gives the precedence for child type argument when compared with the parent type argument.
 * */
public class Example2 {

	public void m1(String s) {
		System.out.println("String Version");
	}
	
	public void m1(Object s) {
		System.out.println("Object Version");
	}
	public static void main(String[] args) {
		Example2 t = new Example2();
		
		t.m1(new Object()); //Object Version

		t.m1("pooja"); //String Version

		t.m1(null); //String Version


	}

}
