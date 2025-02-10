package com.celcom.day4;

class Animal1 {
	String msg = getMessage();

	public String getMessage() {
		return "Animal";
	}
}

class Dog extends Animal1 {
	public String getMessage() {
		return "Dog";
	}
}

public class DmdExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 animal = new Dog();
		System.out.println(animal.msg);
	}

}
