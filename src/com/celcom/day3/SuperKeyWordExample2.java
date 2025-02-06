package com.celcom.day3;

import java.lang.Object;
class A extends Object
{
	A()
	{
		System.out.println("This is class A");
	}
	A(int a)
	{
		super();
		System.out.println("This is class A with parameter");
	}
}
class B extends A
{
	B()
	{
		super(1);
		System.out.println("This is class B");
	}
	B(int b)
	{
		System.out.println("This is class B with parameter");
	}
	void display()
	{
		System.out.println("Hello");
	}
	void display1()
	{
		
	}
}
class C extends B
{
	C()
	{
		//super() is invoked automatically
		System.out.println("This is class C");
	}
	C(int c)
	{
		this();
		System.out.println("This is class C with parameter");
	}
	void display1()
	{
		System.out.println("Welcome");
	}
}
public class SuperKeyWordExample2 {

	public static void main(String[] args) {
		B c=new C(10);
		c.display1();
	}

}
