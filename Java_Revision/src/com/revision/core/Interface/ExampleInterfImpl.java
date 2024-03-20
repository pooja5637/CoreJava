package com.revision.core.Interface;

public class ExampleInterfImpl implements ExampleInterf {

	@Override
	public void div(int a, int b) {

		System.out.println("ans by abstract method:" + (a/b));
	}

	public static void main(String[] args) {

		ExampleInterf t = new ExampleInterfImpl();
		
		t.div(10, 10);
		
		t.add(10, 10);
		
		ExampleInterf.mul(10, 10);
		
		
		
	}

}
