package com.celcom.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		List<Integer > list1 = new ArrayList<>();
		List<Integer > list2 = new ArrayList<>();
		System.out.println("Enter the size : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter the elements in array 1 :");
		for(int i = 0 ; i < size ; i++)
		{
			list1.add(sc.nextInt());
		}
		System.out.println("Enter the elements in array 2 :");
		for(int i = 0 ; i < size ; i++)
		{
			list2.add(sc.nextInt());
		}
		Collections.sort(list1);
		Collections.sort(list2);
		if(list1.equals(list2))
			System.out.print("Equal");
		else
			System.out.println("Not Equal");
	}

}
