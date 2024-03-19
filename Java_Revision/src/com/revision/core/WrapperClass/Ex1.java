package com.revision.core.WrapperClass;

public class Ex1 {

	public static void main(String[] args) {

		/* valueOf() -> It is used to create wrapper object for the given primitive or string.*/
		
		
		/* public static Wrapper valueOf(String s);
		 * 
		 * -> Every Wrapper class except Character class contains a static valueOf() to create wrapper object for the given string

		 * */
		
		
		// public static Wrapper valueOf(Primitive p);
		
	Integer I = Integer.valueOf("10");
	
	System.out.println(I);
	
	//	Integer I = Integer.valueOf("ten");
	// If a string argument not representing a number then will get runtime exception saying " NumberFormatException "
	
	Double D = Double.valueOf("10.5");
	System.out.println(D);
	
	Boolean B = Boolean.valueOf("true");
	System.out.println(B);
	

	
	Boolean B3 = Boolean.valueOf("True");
	System.out.println(B3);
	
	Boolean B1 = Boolean.valueOf("pooja");
	System.out.println(B1);
	
	//Character ch1 = Character.valueOf("ch"); //CE
	
	// public static Wrapper valueOf(Primitive p);
	
	Integer i = Integer.valueOf(10);
	System.out.println(i);

	Character ch = Character.valueOf('a');
	System.out.println(ch);



	Boolean B2 = Boolean.valueOf(true);
	System.out.println(B2);
	
	}

}
