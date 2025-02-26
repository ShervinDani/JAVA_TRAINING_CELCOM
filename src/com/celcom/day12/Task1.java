package com.celcom.day12;

import java.util.ArrayList;
import java.util.Scanner;

class Generics<T>
{
	ArrayList<T> merge(ArrayList<T> l1,ArrayList<T> l2)
	{
		ArrayList<T> l = new ArrayList<>();
		int i1=0,i2=0;
		while(i1<l1.size() && i2<l2.size())
		{
			l.add(l1.get(i1++));
			l.add(l2.get(i2++));
		}
		while(i1<l1.size())
		{
			l.add(l1.get(i1++));
		}
		while(i2<l2.size())
		{
			l.add(l2.get(i2++));
		}
		return l;
		
	}
}
public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		System.out.println("Enter the size of list 1");
		int size1 = sc.nextInt();
		System.out.println("Enter the elements of list 1");
		for(int i = 0; i < size1 ; i++)
		{
			l1.add(sc.nextInt());
		}
		System.out.println("Enter the size of list 2");
		int size2 = sc.nextInt();
		System.out.println("Enter the elements of list 2");
		for(int i = 0; i < size2 ; i++)
		{
			l2.add(sc.nextInt());
		}
		Generics<Integer> gen = new Generics<>();
		System.out.println(gen.merge(l1, l2));
		
	}

}
