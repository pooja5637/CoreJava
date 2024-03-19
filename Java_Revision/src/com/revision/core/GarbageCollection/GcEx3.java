 package com.revision.core.GarbageCollection;

public class GcEx3 {

	// Objects created inside a method
	
	public static void main(String[] args) {

		/* The objects which are created inside a method are by default eligible for GC once method completes.
		 * */
		
		m1(); // after completing m1 execution two objects eligible for GC.
	}

	public static void m1() {
		
		Student s1 = new Student();
		Student s2 = new Student();
	}
}
