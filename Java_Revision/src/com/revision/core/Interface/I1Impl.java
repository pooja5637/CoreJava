package com.revision.core.Interface;


 public class I1Impl implements I1{

	@Override
	public void show() {
		
		System.out.println("1");
	}
	public static void main(String[] args) {

	//	I1 i = new I1(); //-> I1 is abstract cannot be instantiated.
		
		 I1Impl t = new  I1Impl();
		t.show();
	}
	
}