package com.revision.core.Constructor;

class CopyConstructor {
	
	String name;
	int rollno;
	
	// parameterized constructor
	public CopyConstructor(String name, int rollno) {
		
		this.name = name;
		this.rollno = rollno;
	}
	
	// copy constructor
	CopyConstructor(CopyConstructor obj2){
		
		this.name = obj2.name;
		this.rollno = obj2.rollno;
	}
	
	public String toString() {
		return name + "-------" + rollno;
	}

}

public class Test1{
	
	public static void main(String[] args) {
		
		// this would invoke the parameterized constructor
		System.out.println("parameterized constructor");
		CopyConstructor s1 = new CopyConstructor("pooja", 101);
		System.out.println(s1);//pooja-------101

		
		System.out.println();
		// this would invoke the copy constructor
		CopyConstructor s2 = new CopyConstructor(s1);
		System.out.println("copy constructor");
		System.out.println(s2);//pooja-------101

		
		
	}
	
}
