package com.revision.core.Constructor;

/*
 * Note 1: If a parent class contains any argument constructor, 
 * 		   then while writing child classes we have to take special care with respect to constructors.
 * 
 * Note 2: Whenever we writing any argument constructor, It is highly recommended to write no-arg constructor also.*/
public class Ex5 {
	
	Ex5(int i){
		
	}

}


//class C extends Ex5{
	/* compiler will generate
	 * c(){
	 *      super();
	 *     }*/
//}