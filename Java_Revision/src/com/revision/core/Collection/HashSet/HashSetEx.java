package com.revision.core.Collection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		duplicateValueDemo();
		nullValueDemo();
		unorderedDemo();
	}
		public static void duplicateValueDemo() {
			
		// HashSet cannot contain duplicates values.
		
		Set<String> set = new HashSet<String>();
		
		set.add("element1");
		set.add("element1");
		
		// It will display only one element 
		
		System.out.println(set); //[element1]

		
		System.out.println("-----------------------------------------");
		
	}
		
		public static void nullValueDemo() {
			// Set can contain one null value.
			
			Set<String> set = new HashSet<String>();
			
			set.add(null);
			set.add(null);
			
			System.out.println(set); //[null]

			
			System.out.println("-----------------------------------------");

		}
		
		public static void unorderedDemo() {
			// It is unordered collection
			
			Set<String> set = new HashSet<String>();
			
			set.add("pooja");
			set.add("riya");
			set.add("priya");
			set.add("omkar");
			set.add("vaish");
			set.add("element1");
			
			System.out.println(set); //[priya, omkar, element1, pooja, riya, vaish]
			
			System.out.println("-----------------------------------------");

			
		}

}
