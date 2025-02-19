package com.celcom.day11;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,4,20,3,10,5,15,18};
		int amount = 30;
		boolean flag = true;
		for(int i = 0 ;i <arr.length;i++)
		{
			int sum = 0 ;
			int j = i;
			while(sum<amount && j < arr.length)
			{
				sum+=arr[j];
				j++;
			}
			if(sum == amount)
			{
				System.out.println("The suspecious transactions are :");
				for(int k = i ;k < j ; k++)	
				{
					System.out.print(arr[k] + " ");
				}
				System.out.println();
				flag = false;
			}
		}
		if(flag)
		{
			System.out.println("No Suspecious Transcations are made");
		}
	}

}
