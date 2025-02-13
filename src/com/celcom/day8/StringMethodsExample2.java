package com.celcom.day8;

public class StringMethodsExample2 {

	public static void main(String[] args) {
		String s1 = "Welcome To Java Programming ";
		System.out.println("Traversing Method 1 : ");
		for(int i = 0 ; i < s1.length() ; i ++)
		{
			System.out.println(s1.charAt(i));
		}
		System.out.println("Traversing Method 2 : ");
		for(char i : s1.toCharArray())
		{
			System.out.println(i);
		}
		String[] s2 = s1.split(" ");
		for(String s3 : s2)
		{
			System.out.println(s3);
		}
	}

}
