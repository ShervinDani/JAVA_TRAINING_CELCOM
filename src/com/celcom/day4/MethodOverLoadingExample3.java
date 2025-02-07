package com.celcom.day4;

public class MethodOverLoadingExample3 {

	void concat(int number1, int number2) {
		System.out.println("Concatination of numbers is : " + number1 + number2);
	}

	void concat(double number1, double number2) {
		System.out.println("Concatination of double is : " + number1 + number2);
	}

	void concat(String string1, String string2) {
		System.out.println("Concatination of strings is : " + string1 + string2);
	}

	public static void main(String[] args) {
		MethodOverLoadingExample3 concatination = new MethodOverLoadingExample3();
		concatination.concat(10, 10);
		concatination.concat(20.20, 20.0);
		concatination.concat("Shervin", "Dani");
	}

}
