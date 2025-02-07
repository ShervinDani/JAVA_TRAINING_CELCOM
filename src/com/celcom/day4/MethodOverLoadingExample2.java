package com.celcom.day4;

public class MethodOverLoadingExample2 {
	void addition(int num1, int num2) {
		System.out.println("Integer Sum is : " + (num1 + num2));
	}

	void addition(float num1, float num2) {
		System.out.println("Float Sum is : " + (num1 + num2));
	}

	void addition(long num1, long num2) {
		System.out.println("Long Sum is : " + (num1 + num2));
	}

	void addition(double num1, double num2) {
		System.out.println("Double Sum is : " + (num1 + num2));
	}

	public static void main(String[] args) {
		MethodOverLoadingExample2 obj1 = new MethodOverLoadingExample2();
		obj1.addition(10, 10);
		obj1.addition(10f, 10f);
		obj1.addition(10l, 10l);
		obj1.addition(10d, 10d);
	}

}
