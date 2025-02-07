package com.celcom.day4;

// MethodOverLoading
public class MethodOverLoadingExample1 {

	void myMethod(int num) {
		int fact = 1;
		for (int i = 2; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial of the number is : " + fact);
	}

	void myMethod(int num1, int num2) {
		System.out.println("Addition of two numbers is : " + (num1 + num2));
	}

	void myMethod(String name) {
		System.out.println("Welcome : " + name);
	}

	public static void main(String[] args) {
		MethodOverLoadingExample1 obj = new MethodOverLoadingExample1();
		obj.myMethod(5);
		obj.myMethod(10, 20);
		obj.myMethod("Shervin");

	}

}
