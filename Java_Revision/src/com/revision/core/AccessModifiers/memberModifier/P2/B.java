package com.revision.core.AccessModifiers.memberModifier.P2;

import com.revision.core.AccessModifiers.memberModifier.P1.*;

public class B {
	
	public static void main(String[] args) {
		
//		A a = new A(); // Class A is not declared as public, So even m1() is declared as public we cannot access that method outside the package.
//		//we have to check the class visibility
//		a.m1();
		
		A1 a  =  new A1(); // Accessible bcoz class is declared as public	
		a.m1();
		
//		a.m2(); // not visible because m2() is declared as default
		
		ProtectedMemberModifier2 p = new ProtectedMemberModifier2();
  //   	p.m1(); // C.E. from outside package we can access protected members only in child classes
		
		
	}
	

}
