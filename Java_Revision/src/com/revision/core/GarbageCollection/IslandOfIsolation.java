package com.revision.core.GarbageCollection;

public class IslandOfIsolation {

	IslandOfIsolation i;
	
	public static void main(String[] args) {

		// no objects eligible for GC
		IslandOfIsolation t1 = new IslandOfIsolation();
		IslandOfIsolation t2 = new IslandOfIsolation();
		IslandOfIsolation t3 = new IslandOfIsolation();
		
		// no objects eligible for GC
		t1.i = t2 ;
		t2.i = t3 ;
		t3.i = t1 ;
		
		t1 = null;
		t2 = null;
		t3 = null;
		
// after t3 = null, no outside reference is pointing to object thats why 3 objects eligible for GC.

	}

}
