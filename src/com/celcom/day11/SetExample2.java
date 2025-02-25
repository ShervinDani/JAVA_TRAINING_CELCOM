package com.celcom.day11;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample2 {

	public static void main(String[] args) {
		Set<String> tree = new TreeSet<>();
		//tree.add(null)		// throws exception
		tree.add("SHERVIN");
		tree.add("MANI");
		tree.add("DHANAVEL");
		tree.add("VISHAG");
		System.out.println(tree);
		try
		{
			tree.add(null);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		for(String i : tree)
			System.out.println(i);
		Set<String> link = new LinkedHashSet<>();
		link.add("SHERVIN");
		link.add("A");
		link.add(null);
		System.out.println(link);
	}

}
