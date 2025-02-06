package com.celcom.day3;

class Demo
{
	Demo()
	{
		this(0);
		System.out.println("First Constructor");
	}
	Demo(int a)
	{
		this("SHERVIN");
		System.out.println("Second Constructor");
	}
	Demo(String str)
	{
		System.out.println("Third Constructor");
	}
}
public class ThisKeywordExample2 {

	public static void main(String[] args) {
		Demo d1 = new Demo();
	}
}
