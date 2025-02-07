package com.celcom.day4;

class A {
	static {
		System.out.println("A class static method");
	}
	{
		System.out.println("A class instance method");
	}
}

public class JavaBlocksExample1 {
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Second Instance Block");
	}
	static {
		System.out.println("Second Static Block");
	}

	public static void main(String[] args) {
		System.out.println("Main Block");
		JavaBlocksExample1 obj = new JavaBlocksExample1();
		A a = new A();
	}

}
