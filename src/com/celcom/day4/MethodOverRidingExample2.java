package com.celcom.day4;

class Animal {
	int a=20;
	void move() {
		System.out.println("Cannot Define");
	}

	void eat() {
		System.out.println("Cannot Define");
	}
}

class Cat extends Animal {
	int a=10;
	void move() {
		System.out.println("Cat moves by walk");
	}

	void eat() {
		System.out.println("Tom eats Jerry");
	}
}

class Parrot extends Animal {
	void move() {
		System.out.println("Parrot moves by fly");
	}

	void eat() {
		System.out.println("Parrot eats nuts & fruits");
	}
}

class Fish extends Animal {
	void move() {
		System.out.println("Fish will move by swim");
	}

	void eat() {
		System.out.println("Fish will eat sea plants");
	}
}

public class MethodOverRidingExample2 {

	public static void main(String[] args) {
		final int a=10;
		Animal cat = new Cat();
		cat.eat();
		System.out.println(cat.a);
		Animal parrot = new Parrot();
		parrot.move();
		Animal fish = new Fish();
		fish.eat();
	}

}
