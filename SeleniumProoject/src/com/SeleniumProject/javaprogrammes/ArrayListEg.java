package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		
		ArrayList<Object> a = new ArrayList<>();
		
		a.add("Selenium");
		a.add(70000);
		a.add(true);
		a.add(444.44);
		a.add(true);
		a.add(2, "Apple");
		a.set(3,"Boll");
		a.add(10, "UFT");
		
		System.out.println(a.size());
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

	}

}
