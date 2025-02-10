package com.celcom.saturday_assignment_08_feb_2025;

//3. Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle

class Rectangle
{
	int width;
	int length;
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}
	int calculateArea()
	{
		return length*width;
	}
	int calculatePerimeter()
	{
		return 2*(length+width);
	}
}
public class Assignment3 {
	public static void main(String[] args)
	{
		Rectangle rectangle = new Rectangle(10,20);
		System.out.println("Area of the Rectangle is : " + rectangle.calculateArea());
		System.out.println("Perimeter of the Rectangle is : " + rectangle.calculatePerimeter());
	}
	
}
