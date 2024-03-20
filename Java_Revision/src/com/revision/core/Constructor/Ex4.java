package com.revision.core.Constructor;

public class Ex4 {

}


class T1 {
	
	T1(){ }
}

abstract class T2{
	
	T2(){ }
}

interface T3{
	
//	T3(){ } 
}

/* The purpose of constructor is to initialization of instance variable.
 * 
 * but every variable present inside interface is static variable, there is no chance of existing instance variable.
 * 
 * If there is no chance of instance variable where is the question of initialization thats why constructor not required for interface.*/
