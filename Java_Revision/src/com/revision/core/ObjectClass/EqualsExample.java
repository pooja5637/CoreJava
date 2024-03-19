package com.revision.core.ObjectClass;

// equals() -> we can use equals() to check equality of two objects eg. obj1.equals(obj2);

// if our class doesn't contain equals() then object class equals() will be executed.
public class EqualsExample {

	String name;
	int rollno;
	
	
	public EqualsExample(String name, int rollno) {
		
		this.name = name;
		this.rollno = rollno;
	}

//	@Override 
//	public boolean equals(Object obj) {
//		if(obj == this)
//			return true;
//		
//			if(obj instanceof EqualsExample) {
//				EqualsExample s= (EqualsExample) obj;
//				if(name.equals(s.name) && rollno == s.rollno) {
//					return true;
//				}
//				
//				else {
//					return false;
//				}
//			}
//		
//		return false;
//	}

	public static void main(String[] args) {

		EqualsExample s1 = new EqualsExample("pooja" , 101);
		EqualsExample s2 = new EqualsExample("shubham" , 102);
		EqualsExample s3 = new EqualsExample("riyansh" , 103);
		EqualsExample s5 = new EqualsExample("riyansh" , 103);
		EqualsExample s4 = s1;
		
	
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equals(s3)); //false
		System.out.println(s1.equals(s4)); //true
		

		

		
	}

}
