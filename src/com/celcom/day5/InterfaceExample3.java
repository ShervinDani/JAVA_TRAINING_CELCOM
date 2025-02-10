package com.celcom.day5;

interface Interface1{
	int a = 0; // By default interface variable are public static final
	
}
interface Interface2{
	int a = 20;
}
interface Interface3 extends Interface1,Interface2
{
	void add();
}
class Addition implements Interface3
{
	@Override
	public void add() {
		System.out.println("Sum of two numbers is : " + (Interface1.a+Interface2.a));
	}
	
}
class Add
{
	static
	{
		System.out.println("Parent static");
	}
	{
		System.out.println("Parent Instance");
	}
	Add()
	{
		System.out.println("Parent Constructor");
	}
}
class Add1 extends Add
{
	static
	{
		System.out.println("Child static");
	}
	{
		System.out.println("Child Instance");
	}
	Add1()
	{
		System.out.println("Child Constructor");
	}
}
public class InterfaceExample3 {
	public static void main(String[] args) {
//		Addition add = new Addition();
//		add.add();
		Add1 add = new Add1();
	}

}
