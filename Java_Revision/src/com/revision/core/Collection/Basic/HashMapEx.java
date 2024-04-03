package com.revision.core.Collection.Basic;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {

		 HashMap<String, String> hashmap = new HashMap<String, String>();
		 
	      System.out.println("Checking Is HashMap empty?: " + hashmap.isEmpty());

		    // Adding key-value pairs to HashMap
		    hashmap.put("1", "Value1");
		    hashmap.put("2", "Value2");
		    hashmap.put("3", "Value3");
		    hashmap.put("4", "Value4");
		    hashmap.put("5", "Value5");
		    
		   System.out.println("Checking Is HashMap empty?: " + hashmap.isEmpty());

		    System.out.println("Size of the given HashMap is: "+ hashmap.size());
		    System.out.println();

		   // Iterating or looping using entrySet() method

		    for (Map.Entry<String, String> entry : hashmap.entrySet()) {
		    	
		    	String key = entry.getKey();
		    	
		    	String val = entry.getValue();
		
		    	System.out.println(key + " " + val);
	}
	}

}
