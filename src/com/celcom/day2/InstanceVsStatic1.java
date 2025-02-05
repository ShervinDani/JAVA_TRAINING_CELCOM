package com.celcom.day2;

public class InstanceVsStatic1 {
	int num1=10;
	static int num2=30;
	public static void main(String[] args) {
		
		InstanceVsStatic1 obj1=new InstanceVsStatic1();
		InstanceVsStatic1 obj2=new InstanceVsStatic1();
		
		
		//Initial Values
		System.out.println(obj1.num1);
		System.out.println(obj2.num1);
		
		//Final Values
		obj1.num1=50;
		System.out.println(obj1.num1);
		System.out.println(obj2.num1);
		
		//Static Variable
		
		
		//Initial Values
		System.out.println(obj1.num2);
		System.out.println(obj2.num2);
		
		//Final Values
		obj1.num2=50;
		System.out.println(obj1.num2);
		System.out.println(obj2.num2);
	}

}
