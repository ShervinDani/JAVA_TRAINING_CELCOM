package com.celcom.day5;

abstract class Vehicle {
	Vehicle()
	{
		
	}
	void noOfEngine() {
		System.out.println("All vehicle can have one engine");
	}

	abstract void noOfWheels();

	abstract void brandName();

}
class Car extends Vehicle {

	Car()
	{
		super();
	}
	@Override
	void noOfWheels() {
		// TODO Auto-generated method stub
		System.out.println("Got 4 wheels");
	}

	@Override
	void brandName() {
		// TODO Auto-generated method stub
		System.out.println("The car is BMW");
	}

}
public class AbstractClassExample1 {

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.brandName();

	}

}
