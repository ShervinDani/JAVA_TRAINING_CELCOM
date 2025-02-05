package com.celcom.day2;

import java.util.Arrays;
public class ArraySorting {
	public static void main(String[] args)
	{
		int arr[]= {2,6,3,5,7,4,5,4,6,4,6,4};
		System.out.println("Array is : ");
		for(int value : arr)
		{
			System.out.println(value);
		}
		//Arrays is a predefined class in JAVA and sort is a static method
		
		Arrays.sort(arr);
		
		System.out.println("Sorted Array in Ascending Order is : ");
		
		//Ascending Order
		
		for(int value : arr)
		{
			System.out.println(value);
		}
		
		//Minimum and Maximum
		
		System.out.println("Minimum Value is : " + arr[0]);
		System.out.println("Second Minimum Value is : " + arr[1]);
		System.out.println("Maximum Value is : " + arr[arr.length-1]);
		System.out.println("Second Maximum Value is : " + arr[arr.length-2]);
		
		// Descending Order
		
		System.out.println("Sorted Array in Descending Order : ");
		for(int index=arr.length-1;index>=0;index--)
		{
			System.out.println(arr[index]);
		}
	}
}
