package com.celcom.saturday_assignment_08_feb_2025;

import java.util.ArrayList;
import java.util.Scanner;

//5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
class Book
{
	String title;
	String author;
	final long isbn;
	static ArrayList<Book> bookcollection = new ArrayList<>();
	public Book(String title, String author, long isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}     
	static void display()
	{
		for(Book book : bookcollection)
		{
			System.out.println("Book Name : " + book.title);
			System.out.println("Book Author : " + book.author);
			System.out.println("ISBN Code : " + book.isbn);
			
		}
	}
	static void addBook(Book newBook)
	{
		for(Book book : bookcollection)
		{
			if(book.isbn == newBook.isbn)
			{
				System.out.println("Book Already Exist");
				return;
			}
			
		}

		bookcollection.add(newBook);
	}
	static void deleteBook(long isbn)
	{
		for(Book book : bookcollection)
		{
			if(book.isbn==isbn)
			{
				bookcollection.remove(book);
				System.out.println("Deleted Successfuly");
				return;
			}
			
		}
		System.out.println("Book Not Found");

	}
}
public class Assignment5 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("*========================*\n");
			System.out.println("Enter your choice");
			System.out.println("1. Add new Book");
			System.out.println("2. View Book Collection");
			System.out.println("3. Delete book");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Book Title");
				String title = sc.next();
				System.out.println("Enter Book Author");
				String author = sc.next();
				System.out.println("Enter ISBN");
				long isbn = sc.nextLong();
				Book newBook = new Book(title,author,isbn);
				Book.addBook(newBook);
				break;
			case 2:
				System.out.println("The Books are : ");
				Book.display();
				break;
			case 3:
				System.out.println("Enter the isbn of the book to delete");
				isbn=sc.nextLong();
				Book.deleteBook(isbn);
				break;
			default:
				System.out.println("Invalid");
			}
			System.out.println("*========================*\n\n\n");
		}
	}
}
