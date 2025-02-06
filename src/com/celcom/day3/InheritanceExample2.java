package com.celcom.day3;

class Vehicle1
{
	String model;
	double price;
	public Vehicle1(String model, double price) {
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
class TwoWheeler1 extends Vehicle1
{
	String type;
	public TwoWheeler1(String model, double price,String type) {
		super(model, price);
		this.type=type;
	}
	void noOfWheels()
	{
		super.noOfEngine();
		System.out.println("I got two wheels");
	}
	
}

//MultiLevel Inheritance
class Bike1 extends TwoWheeler1
{

	public Bike1(String model, double price) {
		super(model, price, "Bike");
	}
	void brandName()
	{
		super.noOfWheels();
		System.out.println("Brand is : " + super.model);
	}
	
}
public class InheritanceExample2 {
	public static void main(String[] args)
	{
		Bike1 bullet=new Bike1("BULLET HUNTER",300000);
		bullet.brandName();
	}
}
