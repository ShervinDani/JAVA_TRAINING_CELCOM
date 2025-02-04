package com.celcom.day1;

import java.util.Scanner;
public class FactorialTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		int fact=1;
		for(int count=1;count<=num1;count++)
		{
			fact=fact*count;
			System.out.println("The factorial of " + count + " is "+ fact);
		}
	}

}
