package com.celcom.saturday_assignment_08_feb_2025;


//8. Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
class Animal
{
	void makeSound()
	{
		System.out.println("All animals make sound");
	}
}

class Cat extends Animal
{
	@Override
	void makeSound()
	{
		System.out.println("Cat will meow");
	}
}
public class Assignment8 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeSound();
	}

}
