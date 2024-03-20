package com.revision.core.Polymorphism;

/*In general, var-arg method will get least priority
 * if no other method matched then only var-arg method will get chance.
 * */

public class Example4 {

	public void m1(int x) {
		System.out.println("General method");
	}
	
	public void m1(int... x) {
		System.out.println("var-arg method");
	}
	public static void main(String[] args) {

		Example4 t = new Example4();
		
		t.m1(); //var-arg method


		t.m1(10,100); //var-arg method

		
		t.m1(10); // General method.

	}


}
