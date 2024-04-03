package com.revision.core.Collection;

import java.util.HashSet;

public class IterateHashSetUsingForeach {

	 public static void main(String args[]) {
	        
		    // Declaring a HashSet
		    HashSet<String> hashset = new HashSet<String>();
		    
		    // Add elements to HashSet
		    hashset.add("Pear");
		    hashset.add("Apple");
		    hashset.add("Orange");
		    hashset.add("Papaya");
		    hashset.add("Banana");
		    
		    System.out.println("HashSet contains :");
		    
		    // Using for each loop
		    for(String str : hashset){
		    	
		        System.out.println(str);
		        
		    }
		  }
}
