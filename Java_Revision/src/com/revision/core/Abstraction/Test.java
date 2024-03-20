package com.revision.core.Abstraction;

public class Test {

	public static void main(String[] args) {

		Bus b = new Bus();
		System.out.println(b.getNoOfVehicle()); //3
		
		Auto a = new Auto();
		System.out.println(a.getNoOfVehicle()); //6


}
}