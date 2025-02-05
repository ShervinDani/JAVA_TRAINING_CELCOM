package com.celcom.day2;

class Fruits{
	String color;
	double weight;
	double price;
	
	//Constructor
	Fruits(String color,double weight,double price)
	{
		this.color = color;
		this.weight = weight;
		this.price = price;
	}
	
	//Method
	void display()
	{
		System.out.println("Color : " + color);
		System.out.println("Weight : " + weight);
		System.out.println("Price : " + price);
	}
	
	//Setter
	void setPrice(double price)
	{
		this.price=price;
	}
	
	//Getter
	double getPrice()
	{
		return price;
	}
}
public class ClassAndObjectExample2 {
	public static void main(String[] args) {
		Fruits apple=new Fruits("Red",400,20);
		apple.display();
		apple.setPrice(30);
		apple.display();
		System.out.println("Final Price : " + apple.getPrice());
		}

}
