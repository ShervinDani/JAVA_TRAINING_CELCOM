package com.celcom.day11;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hm = new HashMap<>();
		hm.put(1, "SHERVIN");
		hm.put(2, "MANI");
		hm.put(3, "DHANAVEL");
		hm.put(4, "VIZAG");
		
		// type - 1
		System.out.println(hm);
		
		// type - 2
		for(Map.Entry<Integer, String> i : hm.entrySet())
		{
			System.out.println(i.getKey() + " " + i.getValue());
		}
		
		
		// type - 3
		hm.forEach((key,value)->{
			System.out.println(key +" " + value);
		});
		
		Map<Integer,String> hm1 = new HashMap<>();
		hm1.put(5, "SANJAY");
		hm1.put(6, "RANJITH");
		hm1.put(7, "DEEPAK");
		hm.putAll(hm1);
		hm.remove(2);
		hm.merge(1, "DANI", (oldVAlue,newValue)-> oldVAlue + newValue);
		hm.put(1, "SHERVIN DANI");
		hm.putIfAbsent(1, "SHERVIN");
		System.out.println(hm);
		System.out.println(hm.equals(hm1));
		System.out.println(hm.get(4));
		hm1.clear();
		System.out.println(hm1);
	}

}
