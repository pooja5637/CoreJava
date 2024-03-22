package com.revision.core.AccessModifiers.memberModifier.P1;

class ProtectedMemberModifier {

	protected void m1() {
		
		System.out.println("protected method");
	}
}


public class B extends  ProtectedMemberModifier{
	
	public static void main(String args[]) {
		
		 ProtectedMemberModifier a = new  ProtectedMemberModifier();
		 a.m1();
		 
		 B b = new B(); // parent method by default available to child so we can use child reference.
		 b.m1();
		 
		 ProtectedMemberModifier p = new B(); // parent reference can be used to hold child object
		 p.m1();
		 
		
	}
}