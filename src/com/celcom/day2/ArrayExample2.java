package com.celcom.day2;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1=new int[5];
		int sum=0;
		int evenCount=0;
		int oddCount=0;
		System.out.println("Initial Values of Array: ");
		for(int value : arr1)
		{
			System.out.println(value);
		}
		for(int index=0;index<arr1.length;index++)
		{
			System.out.println("Enter Value " + index + " :");
			arr1[index] = sc.nextInt();
		}
		System.out.println("The Entered Values are :");
		for(int index=0;index<arr1.length;index++)
		{
			System.out.println(arr1[index]);
			sum+=arr1[index];
			if(arr1[index]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Sum of the array is : " + sum);
		System.out.println("Odd count in the array is : " + oddCount);
		System.out.println("Even count in the array is : " + evenCount);
	}

}
