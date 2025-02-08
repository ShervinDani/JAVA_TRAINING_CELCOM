package com.celcom.week1assignment;


//10. Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

class Shape
{
	int length,breadth;
	Shape(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void getArea()
	{
		System.out.println("All shapes can have area");
	}
}
class Rectangle1 extends Shape
{
	Rectangle1(int length, int breadth) {
		super(length, breadth);
	}

	@Override
	void getArea()
	{
		System.out.println("Area of the Rectangle is : " + length*breadth);
	}
}
public class Assesment10 {

	
	public static void main(String[] args) {
		Rectangle1 rectangle = new Rectangle1(10,20);
		rectangle.getArea();
	}

}
