package com.revision.core.GarbageCollection;

import java.util.Date;

public class GcEx7 {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		
		System.out.println("Total Memory :"+r.totalMemory());
		System.out.println("Free Memory :"+r.freeMemory());
		
		for(int i = 0 ; i < 10000 ; i++) {
			Date d = new Date();
			d = null;
		}
		
		System.out.println("after creating and nullifying the object - free memory :"+r.freeMemory());
		 
		r.gc();
		
		System.out.println("after calling gc() :"+r.freeMemory());
	}

}
