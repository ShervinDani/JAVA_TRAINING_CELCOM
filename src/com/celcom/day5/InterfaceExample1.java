package com.celcom.day5;

interface VehiclePlan1 {
	int a = 0;

	void noOfEngine();

	void noOfWheels();

}
interface VehiclePlan2
{
	void brandName();
}
class Bike implements VehiclePlan1,VehiclePlan2 {

	@Override
	public void noOfEngine() {
		// TODO Auto-generated method stub
		System.out.println("Bike have only one engine");
	}

	@Override
	public void noOfWheels() {
		// TODO Auto-generated method stub
		System.out.println("Bike got 2 wheels");

	}

	@Override
	public void brandName() {
		// TODO Auto-generated method stub
		System.out.println("Brand Name is BMW");
		
	}

}

public class InterfaceExample1 {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.noOfEngine();
		bike.brandName();
	}

}
