package com.revision.core.Constructor;

// parameterized constructor
public class Student {

	String name;
	int rollno;
	
	Student(String name , int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	@Override
	public String toString() {
		return name + "-----" + rollno;
	}
	public static void main(String[] args) {
		
		Student s1 = new Student("ABC",101);
		Student s2 = new Student("PQC",102);
		
		System.out.println(s1);
		System.out.println(s2);


	}
}
