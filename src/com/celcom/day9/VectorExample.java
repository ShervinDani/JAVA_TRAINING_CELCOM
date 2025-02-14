package com.celcom.day9;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class VectorExample{

	public static void main(String[] args) {
		Vector<Integer> list = new Vector<>();
		System.out.println("Capacity " + list.capacity());
		list.add(10);
		list.add(20);
		list.add(1,30);
		list.add(10);
		list.add(20);
		list.add(1,30);
		list.add(10);
		list.add(20);
		list.add(1,30);
		list.set(1, 20);
		list.add(2, 30);
		list.remove((Integer)20);
		list.removeIf(num-> num==30);
//		list.add(10.0);
//		list.add("JAVA");
		
		System.out.println("Capacity " + list.capacity());
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains(10));
		System.out.println(list.isEmpty());
		
		//traversal
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//traversal - 2
		for(Integer i: list)
		{
			System.out.println(i);
		}
		
		//traversal - 3
		Iterator<Integer> i =list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		Enumeration<Integer> e = list.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
