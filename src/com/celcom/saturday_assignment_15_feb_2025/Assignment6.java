package com.celcom.saturday_assignment_15_feb_2025;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args)
	{
		List<Integer> list = new LinkedList<>();
		System.out.println("Enter the number of Elements : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter the elements");
		for(int i = 0 ; i<size;i++)
			list.add((Integer)sc.nextInt());
		System.out.println("The Elements are : ");
		for(int i = 0;i <size ;i++)
		{
			System.out.println("Element : " + list.get(i));
		}
	}
}
