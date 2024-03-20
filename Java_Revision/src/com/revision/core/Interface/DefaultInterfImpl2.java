package com.revision.core.Interface;

public class DefaultInterfImpl2 implements DefaultInterf {

	// default method overriding is possible
	@Override
	public void m1() {
		System.out.println("My Own Impl");
	}
	
	public static void main(String[] args) {


		DefaultInterfImpl2 t = new DefaultInterfImpl2();
		
		t.m1();
		
	}

}
