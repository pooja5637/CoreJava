package com.revision.core.Inheritance;

class Parent1 {
	void x() {
		System.out.println("parent");
	}
}

class Child1 extends Parent1{
	void y() {
		System.out.println("child 1");
	}
}

class Child2 extends Parent1{
	void z() {
		System.out.println("child 2");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {

		Child1 c1 = new Child1();
		c1.x();
		c1.y();
		
		Child2 c2 = new Child2();
		c2.x();
		c2.z();
	}

}
