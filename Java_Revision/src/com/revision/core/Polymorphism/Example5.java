package com.revision.core.Polymorphism;

public class Example5 {

	public void m1(int i, float f) {
		System.out.println("int-float version");
	}
	
	public void m1(float f, int i) {
		System.out.println("float-int version");
	}
	public static void main(String[] args) {

		Example5 t = new Example5();
		
		t.m1(10, 10.5f);
		t.m1(10.5f, 10);
	//	t.m1(10, 10); // reference to m1() is ambiguous
	//	t.m1(10.5f, 10.5f); // float cannot be promoted to int


		

	}

}
