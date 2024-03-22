package com.revision.core.AccessModifiers.memberModifier.P1;

public class PrivateMemberModifier {

	private void m1() {
		System.out.println("PrivateMemberModifier class method");
	}
}


class Test{
	
	public static void main(String[] args) {
		
		PrivateMemberModifier a = new PrivateMemberModifier();
		
//		a.m1();// if a method declared as private then that method is only accessible in within class only.
	}
}