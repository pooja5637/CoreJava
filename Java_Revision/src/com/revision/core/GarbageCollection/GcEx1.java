package com.revision.core.GarbageCollection;

public class GcEx1 {

	// Nullifying the reference variable
	public static void main(String[] args) {
		
		/* If an Object is no longer required then assign a null to all its reference variables 
		 * then that object automatically eligible for garbage collection.
	   */
		
		// no object eligible for GC
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1 = null; // one obj. eligible for GC
	
		s2 = null; // two obj. eligible for GC
		
		

		
		
		}

}
