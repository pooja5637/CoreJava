package com.revision.core.ObjectClass;

public class HashCodeTest2 {

	int i ;
	
	public HashCodeTest2(int i) {
		
		this.i = i;
	
	}

	@Override
	public int hashCode()
	{
		return i;
	}
	public static void main(String[] args) {
		
	// 10 & 100 will be converted to hex.	
		
	HashCodeTest2 t1 = new HashCodeTest2(10);//com.revision.core.ObjectClass.HashCodeTest2@a

	HashCodeTest2 t2 = new HashCodeTest2(100);//com.revision.core.ObjectClass.HashCodeTest2@64

	
	System.out.println(t1);
	System.out.println(t2);


	}

}
/*
 * hashCode() is present in the program so toString() calls hashCode from HashCodeTest2 class. */
