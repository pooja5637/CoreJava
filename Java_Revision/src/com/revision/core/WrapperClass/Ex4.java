package com.revision.core.WrapperClass;

public class Ex4 {

	//toString()
	public static void main(String[] args) {

		/* we can use toString() to convert wrapper object or primitive to String 
		 * 
		 * -> Every wrapper class contains the following toString() to convert wrapper object to String type.
		 * -> public String toString();
		 * -> It is the overriding version of toString() 
		 * -> whenever we are trying to print wrapper object reference, internally this toString() will be called.*/
		
		Integer I = new Integer(10);
		String s = I.toString();
		System.out.println(s);
		
		System.out.println(I); // internally how it works -> sopln(I.toString())
		
		/* Every wrapper class including Character class  contains the following toString() to convert primitive to string.
		 * -> public static String toString(primitive p);*/
		
		String s1 = Integer.toString(10);
		String s2 = Boolean.toString(true);
		String s3 = Character.toString('a');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);


		
	}

}
