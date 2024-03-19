package com.revision.core.ObjectClass;

public class HashCodeTest1 {
	
	int i;
	
	public HashCodeTest1(int i) {
		this.i = i;
	}
	
	public static void main(String[] args) {
		HashCodeTest1 h1 = new HashCodeTest1(10);
		HashCodeTest1 h2 = new HashCodeTest1(100);
		
		System.out.println(h1);//com.revision.core.ObjectClass.HashCodeTest1@2752f6e2

		System.out.println(h2);//com.revision.core.ObjectClass.HashCodeTest1@27f674d

		
	}

}

/* hashCode() is not there in program so toString() internally calls the Object --> hashCode() */
