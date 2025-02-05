package com.celcom.day2;

public class ArrayExample1 {

	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		
		int[] arr1= {11,22,33,44};
		
		System.out.println("First Array size is : " + arr1.length);
		for(int index=0;index<arr1.length;index++)
		{
			System.out.println("arr1[" + index + "] is :" + arr1[index]);
			sum1+=arr1[index];
		}
		
		int[] arr2=new int[] {11,22,33,44,55,66};
		//Traversing
		System.out.println("Second Array size is : " + arr2.length);
		for(int index=0;index<arr2.length;index++)
		{
			System.out.println("arr2[" + index + "] is :" + arr2[index]);
			sum2+=arr2[index];
		}
		
		//Sum of those arrays
		System.out.println("Sum of Array 1 is : " + sum1);
		System.out.println("Sum of Array 2 is : " + sum2);
		
		//Types of loops to traverse an array
		for(int value : arr2)
		{
			System.out.println(value);
		}
	}

}
