package com.celcom.saturday_assignment_08_feb_2025;

//4. Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.

class Circle
{
	private int radius;
	Circle(int radius)
	{
		this.radius=radius;
	}
	// To access and modify
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	void calculateArea()
	{
		System.out.println("Area is : " + (3.14*radius*radius));
	}
	void calculateCircumferace()
	{
		System.out.println("Circumference is : " + (3.14 * 2 * radius));
	}
}
public class Assignment4 {

	
	public static void main(String[] args) {
		Circle circle = new Circle(4);
		circle.calculateCircumferace();
		circle.calculateArea();
	}

}
