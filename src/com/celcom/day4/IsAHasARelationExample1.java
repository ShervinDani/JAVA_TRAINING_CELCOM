package com.celcom.day4;

class Vehicle {

	void engine() {
		System.out.println("All vehicle has an engine");
	}

	void wheels() {
		System.out.println("All vehicle has wheels");
	}

}

class Wheels {
	void wheelModel() {
		System.out.println("Wheel model is MRF");
	}

	void noOfWheels(String VehicleType) {
		if (VehicleType.equals("Car"))
			System.out.println("Car has 4 wheels");
		else if (VehicleType.equals("Two Wheeler"))
			System.out.println("Bike has 2 wheels");
	}
}

class Engine {
	void engineModel() {
		System.out.println("Engine model is XYZ");
	}

	void noOfEngine() {
		System.out.println("Got one Engine");
	}
}

class Car extends Vehicle { // IS - A Relation
	Wheels wheels = new Wheels(); // Has-A Relation
	Engine engine = new Engine(); // Has-A Relation

	void engineModel() {
		engine.engineModel();
	}

	void wheels() {
		wheels.noOfWheels("Car");
		wheels.wheelModel();
	}
}

public class IsAHasARelationExample1 {

	public static void main(String[] args) {
		Car audi = new Car();
		audi.wheels();
		audi.engineModel();
	}

}
