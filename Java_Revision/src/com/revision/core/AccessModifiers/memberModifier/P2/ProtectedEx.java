package com.revision.core.AccessModifiers.memberModifier.P2;

import com.revision.core.AccessModifiers.memberModifier.P1.ProtectedMemberModifier2;

public class ProtectedEx extends ProtectedMemberModifier2 {

	public static void main(String[] args) {

		ProtectedMemberModifier2 a = new ProtectedMemberModifier2();
//  	a.m1(); // C.E. 1
		
		ProtectedEx b = new ProtectedEx();
		b.m1(); //2 
		
		
		ProtectedMemberModifier2 a1 = new ProtectedEx();
//		a1.m1(); // C.E  3
		
		
		 /* from outside package we can access protected members only in child classes,
		  * and should be by child reference only.(2)
		  * i.e. we cannot use parent reference to call protected members from outside package.(3) & (1)..*/
	}

}
