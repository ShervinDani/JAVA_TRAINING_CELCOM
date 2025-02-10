package com.celcom.day5;
import java.util.Scanner;

interface Area
{
	void calculateArea();
}
interface Perimeter
{
	void calculatePerimeter();
}
abstract class Shape implements Area, Perimeter{
	int radius, length, breadth;
	float height;

	// Circle
	Shape(int radius) {
		this.radius = radius;
	}

	// Rectangle
	Shape(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	// Triangle
	Shape(int length, float height) {
		this.length = length;
		this.height = height;
	}

}

class Circle extends Shape {
	Circle(int radius) {
		super(radius);
	}

	public void calculateArea() {
		double area = 3.14 * radius * radius;
		System.out.println("The area of circle is : " + area);
	}
	
	public void calculatePerimeter()
	{
		System.out.println("The circumference of circle is : " + 2*(3.14*radius));
	}
}

class Rectangle extends Shape {

	Rectangle(int length, int breadth) {
		super(length, breadth);
	}

	public void calculateArea() {
		double area = length * breadth;
		System.out.println("The area of rectangle is : " + area);
	}
	
	public void calculatePerimeter()
	{
		System.out.println("The perimeter of rectangle is : " + 2*(length+breadth));
	}

}

class Triangle extends Shape {

	Triangle(int length, float height) {
		super(length, height);
	}

	public void calculateArea() {
		double area = (0.5) * length * height;
		System.out.println("The area of triangle is : " + area);
	}

	public void calculatePerimeter()
	{
		System.out.println("The perimeter of triangle is : " + (length+breadth+height));
	}
}

public class AbstractCLassAndInterfaceExample {

	public static void main(String[] args) {
		Shape shape;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your choice");
			System.out.println("1.Circle");
			System.out.println("2.Rectangle");
			System.out.println("3.Triangle");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter radius");
				shape = new Circle(sc.nextInt());
			} else if (choice == 2) {
				System.out.println("Enter length and breadth");
				shape = new Rectangle(sc.nextInt(), sc.nextInt());
			} else if (choice == 3) {
				System.out.println("Enter length and height");
				shape = new Triangle(sc.nextInt(), sc.nextFloat());
			} else {
				System.out.println("Invalid");
				return;
			}
			shape.calculateArea();
			shape.calculatePerimeter();
		}
	}

}
