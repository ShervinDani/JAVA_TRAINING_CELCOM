package com.celcom.day1;

class CmdLineArg2{

	public static void main(String[] args)
	{
		if(args.length==2)
		{
			int sum=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
			System.out.println("Sum of two number is : " + sum);
		}
		else
		{
			System.out.println("Insufficient Data");
		}
	}

}