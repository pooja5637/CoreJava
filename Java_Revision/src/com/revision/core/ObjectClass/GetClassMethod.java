package com.revision.core.ObjectClass;

import java.lang.reflect.Method;

public class GetClassMethod {

	public static void main(String[] args) {

		int count = 0 ;
		Object o = new String("pooja");
		Class c = o.getClass();
		System.out.println("Fully qualified name of class:" + c.getName());
		
		Method[] m = c.getDeclaredMethods();
		for(Method m1:m) {
			count++;
			System.out.println(m1.getName());
		}
		
		System.out.println("The number of methods:" + count);
	}
		
	}


