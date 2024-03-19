package com.revision.core.GarbageCollection;

public class GcEx2 {

	// Reassigning the reference variable
	public static void main(String[] args) {

		/* If an object no longer required then reassign its reference variable to some other object
		 *  then old object by default eligible for garbage collection. */
		
		// no object eligible for GC
				Student s1 = new Student();
				Student s2 = new Student();
				
				s1 = new Student(); // one obj. eligible for GC
				
				s2 = s1; // two obj. eligible for GC
	}

}
