package com.celcom.day6;

public class ExceptionHandlingExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Exception");
		//int a = 10/0;     // Divide By Zero Error Exception
		//int[] arr = new int[-1];    //NegativeArraySize Exception
//		int[] arr1 = {10,20};
//		arr1[3]=10;   //ArrayIndexOutOfBounds Exception
		try
		{
			int [] arr = new int[1];
		}
		catch(NegativeArraySizeException e )
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
