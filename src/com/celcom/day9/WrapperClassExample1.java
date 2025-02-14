package com.celcom.day9;

public class WrapperClassExample1 {

	public static void main(String[] args) {
		int a = 10;
		Integer obj1 = new Integer(a); //Boxing
		Integer obj2 = 10; // AutoBoxing
		
		int b = obj1.intValue(); // UnBoxing
		int c = obj1; // Auto Unboxing
		System.out.println(a);
	}

}
