package com.celcom.day12;

public class GenericsExample1 {

	public static void main(String[] args) {
		DemoForGenerics<Integer> demo1 = new DemoForGenerics<>();
		demo1.setValue1(10);
		demo1.setValue2(20);
		System.out.println(demo1.getValue1() + " " + demo1.getValue2());
		DemoForGenerics<String> demo2 = new DemoForGenerics<>();
		demo2.setValue1("Shervin");
		demo2.setValue2("Dani");
		System.out.println(demo2.getValue1() + " " + demo2.getValue2());
	}

}
