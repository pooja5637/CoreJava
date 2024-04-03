package com.revision.core.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {


		List<String> list = new ArrayList<>();
	
		// list allows you to add duplicate elements
		 list.add("element1");
		 list.add("element1");
		 list.add("element2");
		 list.add("element2");
		 
		 System.out.println(list);//[element1, element1, element2, element2]
		 
		 // List allows you to have 'null' values
		 
		 list.add(null);
		 list.add(null);
		 System.out.println(list); //[element1, element1, element2, element2, null, null]
		 
		 // insertion order
		 
		 List<String> list2 = new ArrayList<>();
		 list2.add("pooja");
		 list2.add("riyansh");
		 list2.add("omkar");
		 list2.add("shubham");
		 System.out.println(list2); //[pooja, riyansh, omkar, shubham]

		 // access elements from the list
		 
		 System.out.println(list.get(0)); //element1

		 System.out.println(list.get(4)); //null 
		 
		 System.out.println(list.get(3)); //element2









	}

}
