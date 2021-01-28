package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEg {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<>();
		h.add("Boll");
		h.add("Selenium");
		h.add("Apple");
		h.add("Cat");
		h.add("Apple");
		
		Iterator<String> it =h.iterator();
		
		while(it.hasNext()){
			String data = it.next();
			System.out.println(data);
		}

	}

}
