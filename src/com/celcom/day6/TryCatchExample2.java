package com.celcom.day6;
import java.util.Scanner;

public class TryCatchExample2{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Before exception");
		try {
			int num = sc.nextInt();
			int a = 10 / num;
		} catch (ArithmeticException e) {
			System.out.println(e);
			try
			{
				int b = Integer.parseInt("ABC");
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		catch(Throwable e)
		{
			System.out.println(e);
		}
		System.out.println("After Exception");
		sc.close();
	}

}
 