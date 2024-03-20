package com.revision.core.Polymorphism;

public class AnimalMonkey {

	public void m1(Animal a) {
		System.out.println("Animal Version");
	}
	
	public void m1(Monkey m) {
		System.out.println("Monkey Version");
	}
	public static void main(String[] args) {

		AnimalMonkey t = new AnimalMonkey();
		
		Animal a = new Animal();
		t.m1(a); // animal version
		
		Monkey m = new Monkey();
		t.m1(m); // monkey version
		
		Animal a1 = new Monkey();
		t.m1(a1); // animal version --> bcoz in method overloading, compiler is always responsible to perform method resolution based on the reference type.
				 // a1 is animal type reference thats why output is animal version
	}

}
