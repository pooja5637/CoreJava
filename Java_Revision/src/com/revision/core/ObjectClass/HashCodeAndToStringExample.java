package com.revision.core.ObjectClass;

public class HashCodeAndToStringExample {

	int i ;

	public HashCodeAndToStringExample(int i) {
		
		this.i = i;
	}
	
	@Override
	public String toString()
	{
		// return i; // it will give an error because return type is String & we are trying to return i that is int type.
		
		return i +"";
	}
	
	@Override
	public int hashCode()
	{	
		return i;
	}
	
	public static void main(String[] args) {
		HashCodeAndToStringExample t1 = new HashCodeAndToStringExample(10);
		HashCodeAndToStringExample t2 = new HashCodeAndToStringExample(100);
		
		System.out.println(t1); // 10
		System.out.println(t2); // 100


	}
}

/* toString() present in the program means if we are overriding toString() on our own then toString() will not call hashCode()*/
