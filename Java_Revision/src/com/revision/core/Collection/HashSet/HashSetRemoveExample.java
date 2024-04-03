package com.revision.core.Collection.HashSet;

import java.util.HashSet;
import java.util.Set;

// remove() - remove an element from a HashSEt.
// removeAll() - remove all the elements that exist in a given collection from the HashSet.
// clear() - clear the HashSet completely by removing all the elements.
public class HashSetRemoveExample {

	public static void main(String[] args) {

		// creating HashSet
		
		Set<Integer> numbers = new HashSet<>();
		 numbers.add(1);
		 numbers.add(2);
		 numbers.add(3);
		 numbers.add(4);
		 numbers.add(5);
		 numbers.add(6);
		 numbers.add(7);
		 numbers.add(8);
		 numbers.add(9);
		 numbers.add(10);
		 
		 // using remove() 
		 
		boolean result = numbers.remove(1);
		System.out.println("remove method result:" + result); //remove method result:true

		System.out.println(numbers); //[2, 3, 4, 5, 6, 7, 8, 9, 10]

		
		// using removeAll()

		Set<Integer> evenNumbers = new HashSet<>();
		
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		evenNumbers.add(8);
		evenNumbers.add(10);

		
		numbers.removeAll(evenNumbers);
		System.out.println("after removing even nos.:" + numbers); //after removing even nos.:[3, 5, 7, 9]


		// clear()
		
		numbers.clear();
		System.out.println(numbers); //[]

		
		 
		 

	}

}
