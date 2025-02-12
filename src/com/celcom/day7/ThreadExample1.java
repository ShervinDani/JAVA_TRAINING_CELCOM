package com.celcom.day7;

public class ThreadExample1 {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		
		System.out.println(thread.toString());
		thread.setName("SHERVIN");
		System.out.println(thread.isAlive());
	}
}
