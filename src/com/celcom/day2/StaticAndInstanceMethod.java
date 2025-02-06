package com.celcom.day2;

public class StaticAndInstanceMethod {

	void instanceMethod()
	{
		System.out.println("This is an Instance Method");
	}
	static void staticMethod()
	{
		System.out.println("This is a Static Method");
	}
	public static void main(String[] args) {
		StaticAndInstanceMethod obj1 = new StaticAndInstanceMethod();
		obj1.instanceMethod();
		StaticAndInstanceMethod.staticMethod();
	}

}
