package com.revision.core.Inheritance;

class Parent {
	
	public void m1()
	{
		System.out.println("Parent");
	}
	
}

class Child extends Parent{
	
	public void m2() {
		System.out.println("Child");
	}
}

public class Example{
	public static void main(String[] args) {
	Parent obj = new Parent();
	obj.m1(); // valid
	//obj.m2(); // invalid ->> Whatever properties child has it will not available to the parent
	
	System.out.println("*********************************");
	Child c = new Child();

	// whatever properties parent has it wil by default available to child hence child can call both parent and child specific methods.
	c.m1();
	c.m2();
	System.out.println("*********************************");

	// Parent reference can be used to hold child object.
	Parent p1 = new Child();
	
	obj.m1();
	
// But using that reference we can call only the methods available in parent class. we cannot call child specific method
	//obj.m2();
	System.out.println("*********************************");

//	Child c1 = new Parent();	// child reference cannot be used to hold parent object.
	}	
}
