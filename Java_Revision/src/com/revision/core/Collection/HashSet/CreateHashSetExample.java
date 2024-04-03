package com.revision.core.Collection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {

	public static void main(String[] args) {

		// create a HashSet using the HashSet() Constructor.		
		// add new elements to it using the add() method.
		
		Set<String> programmingLanguages = new HashSet<String>();
		
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("Scala");
		
		System.out.println(programmingLanguages); //[Java, C++, C, Scala, Python]
		
		// let's add duplicate elements
		programmingLanguages.add("Java");
		System.out.println(programmingLanguages); // [Java, C++, C, Scala, Python]
 

		
		


		
	}

}
