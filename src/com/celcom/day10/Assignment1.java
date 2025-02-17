package com.celcom.day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int size = sc.nextInt();
		System.out.println("Enter the elements");
		for(int i = 0 ;i < size ;i++)
		{
			list.add(sc.nextInt());
		}
		List<Integer> newList = new LinkedList<Integer>(list);
		System.out.println("ArrayList : "+list);
		System.out.println("LinkedList : "+newList);
	}

}
