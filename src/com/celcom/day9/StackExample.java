package com.celcom.day9;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		System.out.println(stack);
		System.out.println(stack.peek());
	}

}
