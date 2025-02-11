package com.celcom.day6;

import java.util.Scanner;

class NoVowelFoundException extends Exception {
	@Override
	public String toString() {
		return "No Vowel Found in the String";
	}
}

public class Assignment2 {

	public static boolean containsVowel(String string) {
		for (char i : string.toCharArray()) {
			char ch = Character.toLowerCase(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = sc.next();
		try {
			if (!containsVowel(string)) {
				throw new NoVowelFoundException();
			} else {
				System.out.println("The String contains vowel");
			}
		} catch (NoVowelFoundException e) {
			e.printStackTrace();
		}
	}

}