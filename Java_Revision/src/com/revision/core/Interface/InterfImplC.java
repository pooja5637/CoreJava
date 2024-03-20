package com.revision.core.Interface;

abstract public class InterfImplC implements Interf {

	/*We have to provide implementation for each and every methods;
	 * 
	 * if you are unable to provide implementation for atleast one method then declared class as abstract*/
//	@Override
//	public void m1() {
//
//	}

	@Override
	public void m2() {

	}

}

/* who is responsible to provide implementation for next remaining abstract class? --> child class is rsponsible..*/

class serviceProvider extends InterfImplC{

	@Override
	public void m1() {
		
	}
	
}
// if we did not provide implementation in child class also then compiler gives compile time error.