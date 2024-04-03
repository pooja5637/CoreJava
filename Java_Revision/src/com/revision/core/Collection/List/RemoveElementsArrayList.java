package com.revision.core.Collection.List;

import java.util.ArrayList;
import java.util.List;



public class RemoveElementsArrayList {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("orange");
		
		System.out.println(fruits); //[apple, banana, mango, kiwi, orange]

		
		// remove()

		fruits.remove(3);
		System.out.println(fruits); //[apple, banana, mango, orange]

		
		fruits.remove("banana");
		System.out.println(fruits); //[apple, mango, orange]


		// removeAll() from the given collection
		
		List<String> subFruits = new ArrayList<>();
		subFruits.add("mango");
		subFruits.add("orange");
		
		fruits.removeAll(subFruits);
		System.out.println(fruits); //[apple]


		
		// clear()
		fruits.clear();
		System.out.println(fruits); // []

		




		

	}
}
