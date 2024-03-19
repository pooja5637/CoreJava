package com.revision.core.GarbageCollection;

public class GcEx4 {

	public static void main(String[] args) {

		/* If an method returns an objects and if that returned object we captured by using reference variable then that object 
		 * is not eligible for GC */
		
		Student s = m1(); // after completing m1() only one object is eligible for GC(s2).
	}
	public static Student m1() {
		
		Student s1 = new Student();
		Student s2 = new Student();
		return s1; // return to m1() and hold is reference.
	}

}
