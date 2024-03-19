package com.revision.core.WrapperClass;

public class Ex5 {

	// toXxxString()
	public static void main(String[] args) {

		/* Integer and Long classes contains the following toXxxString() 
		 * public static String toBinary(primitive p)
		 * public static String toOctal(primitive p)
		 * public static String toHex(primitive p)
		 */
		
		String s = Integer.toBinaryString(10);
		System.out.println(s);
		
		String s1 = Integer.toOctalString(10);
		System.out.println(s1);
		
		String s2 = Integer.toHexString(10);
		System.out.println(s2);
		
		
	}
	
	

}
