package com.revision.core.Polymorphism;

public class Example3 {

	public void m1(String s) {
		System.out.println("String version");
	}
	
	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer version");
	}
	public static void main(String[] args) {

		Example3 t = new Example3();
		
		t.m1("pooja");//String version
		
		t.m1(new StringBuffer("ppoja"));//StringBuffer version

	//	t.m1(null); // C.E. reference to m1() is ambiguous. --> Both at the same level & compiler gives priority to child type argument. here two child so w will get compile time error.
	}

}
