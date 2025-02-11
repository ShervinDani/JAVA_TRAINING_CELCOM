package com.celcom.day6;

import java.io.FileReader;

public class TryCatchExample3{
	
	public static void read ()  throws Exception
	{
		FileReader fr = new FileReader("D:\\JAVA TRAINING\\MY_PROJECT\\src\\com\\celcom\\day6\\hello.txt");
		System.out.println(fr.read());
		throw new Exception();
	}
	public static void call()
	{
		try
		{
			read();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Hello");
		}
	}
	public static void main(String[] args){
		call();
	}

}
