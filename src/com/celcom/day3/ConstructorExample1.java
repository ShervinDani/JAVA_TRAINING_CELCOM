package com.celcom.day3;

public class ConstructorExample1 {
	int a;
	
	//Constructor with Argument
	public ConstructorExample1(int a) {
		this.a=a;
	}
	
	//Constructor without Argument
	public ConstructorExample1() {
		this.a=10;
	}

	public static void main(String[] args) {
		ConstructorExample1 obj1 = new ConstructorExample1(20);
		System.out.println(obj1.a);
		ConstructorExample1 obj2 = new ConstructorExample1();
		System.out.println(obj2.a);
		}

}
