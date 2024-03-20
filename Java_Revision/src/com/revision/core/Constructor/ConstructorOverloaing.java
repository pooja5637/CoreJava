package com.revision.core.Constructor;

public class ConstructorOverloaing {

	ConstructorOverloaing(){
		
		this(10);
		System.out.println("no arg");
		
	}
	
	ConstructorOverloaing(int i){
		
		this(10.5);
		System.out.println("int arg");
		
	}
	
	ConstructorOverloaing(double d){
		
		System.out.println("double arg");

	}
	
	public static void main(String[] args) {
		
		ConstructorOverloaing t1= new ConstructorOverloaing();
		System.out.println("************************************");
		
		ConstructorOverloaing t2= new ConstructorOverloaing(10);
		System.out.println("************************************");

		ConstructorOverloaing t3= new ConstructorOverloaing(10L); // automatic type promotion long -> float -> double


	/*Output:
	 * double arg
	 * int arg
	 * no arg
************************************
     * double arg
     * int arg
************************************
     * double arg
       */	
		


	}

}
