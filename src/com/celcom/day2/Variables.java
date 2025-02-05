package com.celcom.day2;

public class Variables {
	int instanceVariable=10;
	static int staticVariable=20;
	public static void main(String[] args) {
		int localVariable=30;
		
		//Accessing local variable;
		System.out.println(localVariable);
		
		//Accessing instance variable;
		Variables variable=new Variables();
		System.out.println(variable.instanceVariable);
		
		//Accessing static variable;
		System.out.println(Variables.staticVariable);
	}

}
