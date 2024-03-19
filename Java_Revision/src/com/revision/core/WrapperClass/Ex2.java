package com.revision.core.WrapperClass;

public class Ex2 {

	// xxxValue()
	public static void main(String[] args) {

		/* we can use xxxValue() methods to get primitive for the given wrapper object.*/
		
		Integer I = new Integer(130);
		
		System.out.println(I.byteValue());
		System.out.println(I.shortValue());
		System.out.println(I.intValue());
		System.out.println(I.longValue());
		System.out.println(I.floatValue());
		System.out.println(I.doubleValue());

		System.out.println("***********************************");
		Character C = new Character('a');
		
		char ch = C.charValue();
		System.out.println(ch);
		
		System.out.println("***********************************");
		
		Boolean B = Boolean.valueOf("pooja"); // convert given string to wrapper
		
		boolean b = B.booleanValue(); // convert wrapper to boolean
		System.out.println(b);
		System.out.println(B.booleanValue());
	}

}
