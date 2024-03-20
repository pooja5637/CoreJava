package com.revision.core.Constructor;

public class NumberOfObjects {

	static int count =0;
	
	{
		count ++;
	}
	
	NumberOfObjects()
	{
		
	}
	
	NumberOfObjects(int i)
	{
		
	}
	
	NumberOfObjects(double d)
	{
		
	}
	public static void main(String[] args) {
		
		NumberOfObjects t = new NumberOfObjects();
		NumberOfObjects t1 = new NumberOfObjects(10);
		NumberOfObjects t2 = new NumberOfObjects(10.5);
		
		System.out.println("The no of objets created:" + count);


	}

}
