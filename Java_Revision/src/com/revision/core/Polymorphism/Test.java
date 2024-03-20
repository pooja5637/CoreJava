package com.revision.core.Polymorphism;

/* In java,method signature consist of method names followed by arg types.*/
/* Return type is not part of the method signature in java.
 *  Compiler will used method signature to resolve method calls */
public class Test {

	// method signature m1(int)
	public void m1(int i) {
		
	}
	
	// method signature m1(String)
	public void m2(String s) {
		
	}
	
	
	
	// Within a class two method with same signature are not allowed.
//	public String m2(String s) {
//		return "test";
//		
//	}
//	
	public static void main(String[] args) {


		Test t = new Test();
		
		t.m1(10);
		t.m2("pooja");
		

		}

}
