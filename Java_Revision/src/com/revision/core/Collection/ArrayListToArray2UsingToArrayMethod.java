package com.revision.core.Collection;

import java.util.ArrayList;

public class ArrayListToArray2UsingToArrayMethod {

	 public static void main(String args[]) {
		 
	      // Instantiating and initializing ArrayList  
		 
	      ArrayList<String> cities = new ArrayList<>();
	      
	      cities.add("Boston");
	      cities.add("Dallas");
	      cities.add("San jose");
	      cities.add("Chicago");

	      // ArrayList to String array conversion using toArray()
	      String citinames[] = cities.toArray(new String[cities.size()]);

	      // Printing elements using for-each loop
	      for(String str : citinames) {
	        System.out.println(str);      
	      }
	    }
}
