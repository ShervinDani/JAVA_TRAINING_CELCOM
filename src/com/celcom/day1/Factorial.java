package com.celcom.day1;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		int fact=1;
		for(int count=2;count<=number;count++)
		{
			fact*=count;
		}
		System.out.println("The Factorial is : " + fact);
	}
}
