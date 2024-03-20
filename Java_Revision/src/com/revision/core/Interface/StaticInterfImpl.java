package com.revision.core.Interface;

public class StaticInterfImpl implements StaticInterf {


	public static void main(String[] args) {

		StaticInterfImpl t = new StaticInterfImpl();
		
		// t.sum(10,20); // C.E.
		// StaticInterfImpl.sum(10,20); // C.E.
		
		StaticInterf.sum(10, 20);
		
	}

}
