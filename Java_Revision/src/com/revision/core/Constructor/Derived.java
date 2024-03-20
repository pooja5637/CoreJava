package com.revision.core.Constructor;
class Base
{
	Base(){
		System.out.println("base class constructor called...");
	}
}
public class Derived {

	Derived(){
		
	    // compiler will generate --> super();
		System.out.println("derived class constructor called...");

	}
	
	public static void main(String[] args) {
		
		Derived d = new Derived();
		
		/* first super class constructor will be called thereafter dervied constructor will be called.*/
	}
}
