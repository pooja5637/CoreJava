package com.revision.core.ObjectClass;

public class StudentOverridetoString {

	String name;
	int rollno;
	
	
	public StudentOverridetoString(String name, int rollno) {

		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString(){
		return  name +"--------" + rollno;
	}
	

	public static void main(String[] args) {
	
		StudentOverridetoString s1 = new StudentOverridetoString("pooja",101);
		StudentOverridetoString s2 = new StudentOverridetoString("akash",102);
		
		System.out.println(s1); //pooja--------101
		System.out.println(s1.toString()); //pooja--------101
		System.out.println(s2); //akash--------102
	
	}

}
