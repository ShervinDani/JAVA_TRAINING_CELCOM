package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the number of Elements : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter the elements");
		for(int i = 0 ; i<size;i++)
			list.add(sc.nextInt());
		System.out.println("Initial List");
		System.out.println(list);
		System.out.println("Sorted List");
		Collections.sort(list);
		System.out.println(list);
	}

}
