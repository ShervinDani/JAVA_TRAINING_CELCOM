package com.celcom.day3;

//Class Mobile
class Mobile{
	int imei;
	String brand;
	double price;
	String model;
	Mobile(int imei,String brand,double price,String model)
	{
		this.imei=imei;
		this.brand=brand;
		this.price=price;
		this.model=model;
	}
	void setPrice(double price)
	{
		this.price=price;
	}
	void display()
	{
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
	}
}

public class ClassAndObjectExample1 {

	public static void main(String[] args) {
		
		//Object Creation
		Mobile redmi=new Mobile(100,"Redmi",12000.0,"Note 12");
		
		redmi.display();
		
		redmi.setPrice(13000);
		
		redmi.display();
	}

}
