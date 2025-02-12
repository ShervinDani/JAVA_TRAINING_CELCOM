package com.celcom.day7;
interface Calculator
{
	int calc(int a,int b);
}
public class AnonymousInnerClassExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator add = (a,b) -> a+b;
		
		Calculator sub = (a,b) -> a-b;
		
		Calculator mul = (a,b) -> a*b;
		
		Calculator div = (a,b) -> a/b;
		
		System.out.println(add.calc(10,20));
		System.out.println(sub.calc(20,10));
		System.out.println(mul.calc(10,20));
		System.out.println(div.calc(30,15));
	}

}
