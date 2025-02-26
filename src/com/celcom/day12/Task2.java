package com.celcom.day12;

import java.util.ArrayList;
import java.util.Scanner;

class Generics1<T> {
	boolean check(ArrayList<T> l1, ArrayList<T> l2) {
		if (l1.size() != l2.size()) {
			return false;
		}
		for (int i = 0; i < l1.size(); i++) {
			if (!l1.get(i).equals(l2.get(i))) {
				return false;
			}
		}
		return true;
	}
}

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		System.out.println("Enter the size of list 1");
		int size1 = sc.nextInt();
		System.out.println("Enter the elements of list 1");
		for (int i = 0; i < size1; i++) {
			l1.add(sc.nextInt());
		}
		System.out.println("Enter the size of list 2");
		int size2 = sc.nextInt();
		System.out.println("Enter the elements of list 2");
		for (int i = 0; i < size2; i++) {
			l2.add(sc.nextInt());
		}
		Generics1<Integer> gen = new Generics1<>();
		if (gen.check(l1, l2)) {
			System.out.println("Contains same element on the same index");
		} else {
			System.out.println("Contains different elements");
		}

	}

}
