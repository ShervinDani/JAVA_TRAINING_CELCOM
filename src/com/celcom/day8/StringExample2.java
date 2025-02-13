package com.celcom.day8;

public class StringExample2 {

	public static void main(String[] args) {
		String s1 = "Java";
		s1.concat("Programming");
		System.out.println(s1);
		s1 = s1.concat("Programming");
		System.out.println(s1);
		StringBuffer str1 = new StringBuffer("Java");
		str1.append(" Programming");
		str1.replace(0, 2, s1);
		str1.append("Hello ytrewq33");
		System.out.println(str1.length());
		System.out.println(str1.capacity());
		StringBuilder str2 = new StringBuilder("Java Programming");
		System.out.println(str2);
		System.out.println(str2.capacity());
	}

}
