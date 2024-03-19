package com.revision.core.GarbageCollection;

public class GcEx5 {

	public static void main(String[] args) {

		/* If returned object we did not captured by using reference variable then that object is eligible for GC*/
		m1(); // Two Objects eligible for GC ( s1 , s2 )
	}
	public static Student m1() {
		
		Student s1 = new Student();
		Student s2 = new Student();
		return s1; 
	
	}

}
