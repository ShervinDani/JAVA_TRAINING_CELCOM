package com.celcom.day4;

public class ConstructorOverLoadingExample1 {

	public ConstructorOverLoadingExample1() {
		this(10);
		System.out.println("This is constructor with no argument");
	}

	public ConstructorOverLoadingExample1(int num1) {
		this(10, 20);
		System.out.println("This is constructor with one argument");
	}

	public ConstructorOverLoadingExample1(int num1, int num2) {
		System.out.println("This is constructor with two argument");
	}

	public static void main(String[] args) {
		ConstructorOverLoadingExample1 obj1 = new ConstructorOverLoadingExample1();
//		obj1 = new ConstructorOverLoadingExample1(10);
//		obj1 = new ConstructorOverLoadingExample1(10, 20);

	}

};