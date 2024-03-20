package com.revision.core.Interface;

/* Two interfaces can contain default method with same signature then there may be a chance of ambiguity problem(diamond problem) to the implementation class.
 * To overcome this problem compulsory we should override default method in the implementation class otherwise we will get compile time error.*/

// How to override default method in the implementation class?

/*In the implementation class we can provide complete new implementation or we can call any interfacename.super.m1()*/
public class LRInterfImpl implements RightDefaultInterf, LeftDefaultInterf {

	@Override
	public void m1() {
		//System.out.println("LRInterfImpl implementation class method.");
		LeftDefaultInterf.super.m1();

	}
	
	public static void main(String[] args) {
		LRInterfImpl t = new LRInterfImpl();
		t.m1();
		
		
		
	}
	
}
