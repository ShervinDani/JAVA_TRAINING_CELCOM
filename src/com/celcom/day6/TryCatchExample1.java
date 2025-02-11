package com.celcom.day6;

import java.util.Scanner;

public class TryCatchExample1{


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Before exception");
//		try {
//			int num = sc.nextInt();
//			int a = 10 / num;
//			int b = Integer.parseInt("ABC");
//		} catch (ArithmeticException e) {
//			System.out.println(e);
//		} catch (NumberFormatException e) {
//			System.out.println(e);
//		}
//		System.out.println("After Exception");
		try
		{
			try
			{
				int a = 10/0;
			}
			finally
			{
				System.out.println("Inside");			
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
	}

}
 