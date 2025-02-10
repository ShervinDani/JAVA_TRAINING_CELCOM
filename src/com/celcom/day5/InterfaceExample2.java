package com.celcom.day5;


interface Animal {
	void move();

	void eat();
}

class Cat implements Animal {
	public void move() {
		System.out.println("Cat moves by walk");
	}

	public void eat() {
		System.out.println("Tom eats Jerry");
	}
}

class Parrot implements Animal {
	public void move() {
		System.out.println("Parrot moves by fly");
	}

	public void eat() {
		System.out.println("Parrot eats nuts & fruits");
	}
}

class Fish implements Animal {
	public void move() {
		System.out.println("Fish will move by swim");
	}

	public void eat() {
		System.out.println("Fish will eat sea plants");
	}
}

public class InterfaceExample2 {

	public static void main(String[] args) {
		final int a=10;
		Animal cat = new Cat();
		cat.eat();
		Animal parrot = new Parrot();
		parrot.move();
		Animal fish = new Fish();
		fish.eat();
	}

}
