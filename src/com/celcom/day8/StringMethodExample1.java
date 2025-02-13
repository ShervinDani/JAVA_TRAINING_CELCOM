package com.celcom.day8;

public class StringMethodExample1 {

	public static void main(String[] args) {
		String s1 = "JavA";
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		System.out.println(s1.concat(" Programming"));
		System.out.println(s1.replace('a', 'o'));
		System.out.println(s1.equals("Java"));
		System.out.println(s1.equalsIgnoreCase("java"));
		System.out.println(s1.contains("av"));
		System.out.println(s1.endsWith("A"));
		System.out.println(s1.compareTo("JavA"));
		System.out.println(s1.substring(1));
		System.out.println(s1.split("a", 2)[0]);
	}

}
