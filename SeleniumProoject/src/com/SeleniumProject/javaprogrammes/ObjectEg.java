package com.SeleniumProject.javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) {
		
		Object[] x = {10000, "Selenium", 333.3, true, 'M'};
		
		System.out.println(x.length);
		
//		for (Object data : x) {
//			System.out.println(data);
//		}
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

	}

}
