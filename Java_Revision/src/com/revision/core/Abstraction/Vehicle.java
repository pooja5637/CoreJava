package com.revision.core.Abstraction;

public abstract class Vehicle {
	
	public abstract int getNoOfVehicle();
	
	/*
	 * if i remove yjis line,program will run or not?
	 * 	 program will compile and run..
	 * then what is the use of that line?
	 * 	 if i remove this line , child may provide getNoOfVehicle or may not.
	 *   but if i keep this line child should have compulsory provide the implementation for getNoOfVehicle()*/
}
