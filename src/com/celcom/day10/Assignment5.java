package com.celcom.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer > list1 = new ArrayList<>();
			System.out.println("Enter the size : ");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			System.out.println("Enter the elements :");
			for(int i = 0 ; i < size ; i++)
			{
				list1.add(sc.nextInt());
			}
			Collections.sort(list1);
			System.out.println("The sorted list is : " + list1);
	}

}
