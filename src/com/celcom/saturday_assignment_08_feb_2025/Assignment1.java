package com.celcom.saturday_assignment_08_feb_2025;


//1. Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.


class Person
{
	int age;
	String name;
	String gender;
	public Person(int age, String name, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		Person person1 = new Person(21,"SHERVIN","Male");
		person1.display();
		Person person2 = new Person(21,"MANI","Male");
		person2.display();
		
	}

}
