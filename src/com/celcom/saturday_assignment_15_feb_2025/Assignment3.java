package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the number of Elements : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter the elements");
		for(int i = 0 ; i<size;i++)
			list.add((Integer)sc.nextInt());
		List<Integer> newList = new ArrayList<>();
		for(Integer i : list)
		{
			newList.add(i);
		}
		System.out.println("The new array Elements are : ");
		System.out.println(newList);
		
	}

}