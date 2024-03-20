package com.revision.core.Interface;

public class StaticInterfImplEx2 implements StaticInterf {
	/* As interface static methods by default not available to the implementation class, overriding is not applicable.
	 * 
	 * means parent method by default not available to the child class.
	 * 
	 * Based on our requirement we can defined exactly same method in the implementation class, its valid but not overriding.*/
	public static void sum(int a, int b)
	{
		System.out.println("The sum:"+ (a+b));
	}// valid, but not overriding.
	
	/*
	 * In the normal java classes, while overriding we cant reduce the scope of access modifier.
	 * but in these case it is valid because this is not overriding*/
	private static void sum()
	{
		
	}
	
	/*static(Interface) -> non- static(impl class) --> valid but not overriding.[see the comment]*/
	public void sum(int a) {
		
	}


}
//
///*
//* In java, if parent method is static and child class method is non static then immediately we will get compile time error.
//* because we cannot override  a static method as non static method.
//but in this scenario we will not get any compile time error because this not overriding concept. */
//*/


//# parent static  method by default not available to the child class thats why overriding is not applicable.
