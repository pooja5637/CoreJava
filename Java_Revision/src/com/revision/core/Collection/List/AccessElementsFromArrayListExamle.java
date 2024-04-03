package com.revision.core.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExamle {

	public static void main(String[] args) {
		
		List<String> topProgrammingLang = new ArrayList<>();
		
		// how to check if an ArrayList is empty using the isEmpty() method.
		System.out.println("is the topProgrammingLang list empty?: " + topProgrammingLang.isEmpty()); //true
		
		topProgrammingLang.add("java");
		topProgrammingLang.add("python");
		topProgrammingLang.add("scala");
		topProgrammingLang.add("c");
		topProgrammingLang.add("c++");

		System.out.println("is the topProgrammingLang list empty?: " + topProgrammingLang.isEmpty()); //false
		
		// how to find the size of an ArrayList using the size().
		System.out.println(topProgrammingLang.size()); //5
		
		// how to access the element at a particular index in an ArrayList using the get()
		
		System.out.println(topProgrammingLang.get(4)); // c++
		
		// how to modify the element at a particular index in an ArrayList using the set()
		
		topProgrammingLang.set(3, "C#");
		System.out.println(topProgrammingLang); //[java, python, scala, C#, c++]



		
		




		
	}

}
