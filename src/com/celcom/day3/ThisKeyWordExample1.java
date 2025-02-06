package com.celcom.day3;

class Sample
{
	String name;
	Sample()
	{
		this("SHERVIN");
	}
	Sample(String name)
	{
		this.name=name;
	}
	void display()
	{
		this.name="SHERVIN DANI";
		System.out.println("WELCOME " + name);
	}
}
public class ThisKeyWordExample1 {

	public static void main(String[] args) {
		Sample obj1 = new Sample();
		obj1.display();
	}

}
