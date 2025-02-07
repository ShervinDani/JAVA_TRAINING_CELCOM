package com.celcom.day4;

import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = sc.nextInt();
		if (num1 % 2 != 0) {
			System.out.println("Non Pronic Number");
			return;
		}
		for (int index = 1; index <= Math.sqrt(num1); index++) {
			if (index * (index + 1) == num1) {
				System.out.println("Pronic Number");
				return;
			}
		}
		System.out.println("Non Pronic Number");
	}

}
