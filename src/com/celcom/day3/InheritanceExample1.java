package com.celcom.day3;

class Vehicle
{
	String model;
	double price;
	public Vehicle(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}
	void noOfEngine()
	{
		System.out.println("I have one engine");
	}
}

//Single Level Inheritance
class TwoWheeler extends Vehicle
{
	String type;
	public TwoWheeler(String model, double price,String type) {
		super(model, price);
		this.type=type;
	}
	void noOfWheels()
	{
		System.out.println("I got two wheels");
	}
	
}

//Heiarchial Inheritance
class Car extends Vehicle
{
	String type;
	public Car(String model, double price,String type) {
		super(model, price);
		this.type=type;
	}
	void noOfWheels()
	{
		System.out.println("I got four wheels");
	}
}
//MultiLevel Inheritance
class Bike extends TwoWheeler
{

	public Bike(String model, double price) {
		super(model, price, "Bike");
	}
	void brandName()
	{
		System.out.println("Brand is : " + model);
	}
	
}
public class InheritanceExample1 {
	public static void main(String[] args)
	{
		Bike bullet=new Bike("BULLET HUNTER",300000);
		bullet.noOfEngine();
		bullet.noOfWheels();
		bullet.brandName();
		Car bmw=new Car("BMW",30000000,"CAR");
		bmw.noOfEngine();
		bmw.noOfWheels();
	}
}
