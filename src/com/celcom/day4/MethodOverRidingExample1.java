package com.celcom.day4;

class SuperClass {
	void display() {
		System.out.println("This is Parent Class");
	}
}

class SubClass extends SuperClass {
	@Override
	void display() {
		System.out.println("This is Child Class");
	}
}

public class MethodOverRidingExample1 {

	public static void main(String[] args) {
		SuperClass parent = new SuperClass();
		parent.display();
		SubClass child1 = new SubClass();
		child1.display();
		SuperClass child2 = new SubClass(); // Dynamic Method Dispatch
		child2.display();
	}
}
