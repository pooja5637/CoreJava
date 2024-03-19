package com.revision.core.GarbageCollection;

public class GcEx6 {

	static Student s;
	
	public static void main(String[] args) {

		m1(); // after completing m1(), only local variable object eligible to GC...so in this case one object is eligible for GC.
		
	}
	
	public static void m1() {
		s = new Student(); // static object
		Student s1 = new Student(); // local object
		
	}

}
