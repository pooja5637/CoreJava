package com.revision.core.ObjectClass;

// toString() example -> we can use toString() to get String representation of an object.
public class Student {
	
	String name;
	int rollno;
	public Student(String name, int rollno) {

		this.name = name;
		this.rollno = rollno;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("pooja", 101);
		Student s2 = new Student("Ravi", 102);
		
		System.out.println(s1); //com.revision.core.ObjectClass.Student@2752f6e2

		System.out.println(s1.toString()); //com.revision.core.ObjectClass.Student@2752f6e2

		System.out.println(s2); //com.revision.core.ObjectClass.Student@27f674d

	}
}
/*
 * In the above example Object toString() got executed which is implemented as follows:
 * public String toString()
 * {
 * 		return getClass.getName()+"@"+Integer.toHexString(hashCode());
 * }*/


/* based on our requirement we can override toString() to provide our own string representation.
 * eg. whenever we are trying to print Student Object reference to print his name & rollno we have to override tostring() as follows
 *  @override
 *  public String toString()
 *  {
 *  	return name + "------" + rollno;
 *  }*/
