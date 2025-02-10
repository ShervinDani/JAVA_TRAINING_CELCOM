package com.celcom.saturday_assignment_08_feb_2025;

//9. Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

class Vehicle
{
	void drive()
	{
		System.out.println("All vehicles can move");
	}
}
class Car extends Vehicle
{
	@Override
	void drive()
	{
		System.out.println("Repairing a car");
	}
}
public class Assignment9 {
	public static void main(String[] args)
	{
		Car car = new Car();
		car.drive();
	}
}
