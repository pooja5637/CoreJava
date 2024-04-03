package com.revision.core.Collection.Basic;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSetUsingIterator {
	
	 public static void main(String args[]) {
	        
		    // Declaring a HashSet
		    HashSet<String> hashset = new HashSet<String>();
		    
		    // Add elements to HashSet
		    hashset.add("Pear");
		    hashset.add("Apple");
		    hashset.add("Orange");
		    hashset.add("Papaya");
		    hashset.add("Banana");  
		    
		    // Get iterator
		    Iterator<String> itr = hashset.iterator();
		    
		    // Show HashSet elements
		    System.out.println("HashSet contains: ");
		    
		    while(itr.hasNext()) {
		    	
		      System.out.println(itr.next());
		    }
		  }

}
