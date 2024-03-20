package com.revision.core.Inheritance;

class Superclass
{
	void x() {
		System.out.println("Superclass Method");
	}
}

class Subclass1 extends Superclass{
	void y() {
		System.out.println("Subclass1 Method");
	}
}

class Subclass2 extends Subclass1{
	void z() {
		System.out.println("Subclass2 Method");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {

		Subclass2 obj = new Subclass2();
		obj.x();
		obj.y();
		obj.z();
		
	}

}
