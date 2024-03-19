package com.revision.core.WrapperClass;

public class Ex3 {

	//parseXxx()
	public static void main(String[] args) {
		
		/* we can use parseXxx() to convert string to primitive
		 * 
		 * -> every wrapper class except character class contains the following parseXxx() to find primitive for the given String object
		 *  */
		
		// public static primitive parseXxx(String s);
		
		int i = Integer.parseInt("10");
		System.out.println(i);
		
		double d = Double.parseDouble("10.5");
		System.out.println(d);
		
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);

	}

}
