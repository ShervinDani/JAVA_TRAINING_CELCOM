package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the number of Elements : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter the elements");
		for(int i = 0 ; i<size;i++)
			list.add((Integer)sc.nextInt());
		System.out.println("The initial List is :");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("The Reversed List is : ");
		System.out.println(list);
	}
}
