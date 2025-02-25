package com.celcom.day11;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new LinkedHashMap<>();
		hm.put(1, "SHERVIN");
		hm.put(2, "MANI");
		hm.put(3, "DHANAVEL");
		hm.put(4, "VIZAG");
		hm.put(5, "SANJAY");
		hm.put(6, "RANJITH");
		hm.put(7, "DEEPAK");
		try
		{
			hm.put(null, "null");
			hm.put(null, "null 1");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("SHERVIN"));
		Set<Entry<Integer,String>> i = hm.entrySet();
		Set<Integer> s = hm.keySet();
		System.out.println(s);
		System.out.println(i);
		System.out.println(hm.get(1));
		Collection<String> l = hm.values();
		System.out.println(l);
		System.out.println(hm.size());
	}

}
