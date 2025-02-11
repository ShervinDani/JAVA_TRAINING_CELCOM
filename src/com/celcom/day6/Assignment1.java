package com.celcom.day6;

import java.util.Scanner;

class DuplicateException extends RuntimeException {
	@Override
	public String toString() {
		return "Entered duplicate values";
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		try {
			for (int index = 0; index < size; index++) {
				arr[index] = sc.nextInt();
				for (int index1 = 0; index1 < index; index1++) {
					if (arr[index] == arr[index1]) {
						throw new DuplicateException();
					}
				}
			}
		} catch (DuplicateException e) {
			System.out.println(e);
		}
	}

}
