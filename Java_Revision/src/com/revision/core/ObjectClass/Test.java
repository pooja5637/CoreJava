package com.revision.core.ObjectClass;

import java.util.ArrayList;

/*
 * In all wrapper classes , in all collection classes, String class, StringBuffer classes 
 * toString() is overridden for meaningful string representation
 * hence it is highly recommended to override toString() in our class also */
public class Test {

	@Override
	public String toString()
	{
		return "test";
	}
	
	public static void main(String[] args) {

		String s = new String("pooja");
		System.out.println(s); //pooja
		
		Integer I = new Integer(10);
		System.out.println(I); //10
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		
		System.out.println(l); // [A.B]
		
		Test t = new Test();
		System.out.println(t); //test

	}

}
