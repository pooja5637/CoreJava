package com.revision.core.ObjectClass;

import java.lang.reflect.Method;

public class Test1 {
	
// To check how many methods a class have:
	public static void main(String[] args) throws Exception
	{

		int count = 0 ;
		Class c = Class.forName("java.lang.Object");
		
		Method[] m = c.getDeclaredMethods();
		for(Method m1:m) {
			count++;
			System.out.println(m1.getName());
		}
		
		System.out.println("The number of methods:" + count);
	}

}

/*
 * Output:
 * wait
 * wait
 * wait
 * equals
 * toString
 * hashCode
 * getClass
 * clone
 * notify
 * notifyAll
 * The number of methods:11
 * */
