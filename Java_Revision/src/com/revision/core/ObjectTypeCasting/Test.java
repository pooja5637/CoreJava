package com.revision.core.ObjectTypeCasting;

public class Test {

	public static void main(String[] args) {

		Base2 b = new Derived4();

		Object o = (Base2) b; // 
		
//		Object o1 = (Base1) b; // C.E --> inconvertible types -- cannot cast from Base2 to Base1
		
		Object o2 = (Derived3) b; // R.E --> classCastException
		
//		Base2 b1 = (Base1) b; // C.E --> inconvertible types -- Cannot convert from Base1 to Base2
		
//		Base1 b1 = (Derived4) b; // C.E. --> Cannot convert from Derived4 to Base1
		
//		Base1 b1 = (Derived1) b; //cannot cast from Base2 to Derived1
		
		
		
	}

}


