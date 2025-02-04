package com.celcom.day1;

import java.util.Scanner;

public class UserInputExample{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int eid=sc.nextInt();
		System.out.println("Enter Employee Name:");
		String name=sc.next();
		System.out.println("Enter Employee Salary:");
		double salary=sc.nextDouble();
		System.out.println("Employee ID: " + eid);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
	}
}