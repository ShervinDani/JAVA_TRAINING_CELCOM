package com.celcom.day11;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapExample3 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new TreeMap<>();
		hm.put(1, "SHERVIN");
		hm.put(2, "MANI");
		hm.put(3, "DHANAVEL");
		hm.put(4, "VIZAG");
		hm.put(5, "SANJAY");
		hm.put(6, "RANJITH");
		hm.put(7, "DEEPAK");
		try {
			hm.put(10, null);
			hm.put(11, null);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("SHERVIN"));
		Set<Entry<Integer, String>> i = hm.entrySet();
		System.out.println(i);
		System.out.println(hm.get(1));
		Collection<String> l = hm.values();
		System.out.println(l);
	}

}
