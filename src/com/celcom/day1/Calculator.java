package com.celcom.day1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Enter first number");
			int num1 = sc.nextInt();
			System.out.println("Enter second number");
			int num2 = sc.nextInt();
			System.out.println("Choose the operation");
			System.out.println("1. Add");
			System.out.println("2. Subtrat");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Modulo");
			System.out.println("6. Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Sum: " + (num1 + num2));
				break;
			case 2:
				System.out.println("Difference: " + (num1 - num2));
				break;
			case 3:
				System.out.println("Product: " + (num1 * num2));
				break;
			case 4:
				System.out.println("Quotient: " + (num1 / num2));
				break;
			case 5:
				System.out.println("Remainder: " + (num1 % num2));
				break;
			}
		}while(choice<6);
	}
}
