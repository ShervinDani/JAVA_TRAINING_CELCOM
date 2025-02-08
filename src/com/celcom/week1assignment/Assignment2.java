package com.celcom.week1assignment;


//2. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

class Dog
{
	String name;
	String breed;
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Breed : " + breed);
	}
	
}
public class Assignment2 {

	public static void main(String[] args) {
		Dog german = new Dog("PUPPY","GERMAN SHEPHERD");
		System.out.println("Dog Details before edit");
		german.display();
		german.setBreed("BULL DOG");
		System.out.println("Dog Details after edit");
		german.display();
		Dog pug = new Dog("JOE","PUG");
		System.out.println("Dog Details before edit");
		pug.display();
		pug.setName("ROSE");
		System.out.println("Dog Details after edit");
		pug.display();

	}

}
