package com.celcom.day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add(null);
		set.add(null);
		set.add("Hello1");
		System.out.println(set);
		Set<String> set1 = new HashSet<>();
		set1.add("Normal");
		set1.add("Example");
		set.addAll(set1);
		System.out.println(set);
		if (set.containsAll(set1)) {
			System.out.println("Contains");
		}
		set.removeAll(set1);
		System.out.println(set1);
		set.addAll(set1);
		set.add("Hello");
		set.retainAll(set1);
		System.out.println(set + " " + set1);
		set.clear();
		if (set.isEmpty()) {
			System.out.println("Set is Empty");
		}
		System.out.println(set.toString());
		Set<String> tree = new TreeSet<>();
		tree.add("Sample");
		tree.add("Tree");
		tree.add("A");
		System.out.println(tree);
		Iterator<String> i = tree.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		Object[] arr = tree.toArray();
		for (Object j : arr) {
			System.out.println(j);
		}
		
	}

}
