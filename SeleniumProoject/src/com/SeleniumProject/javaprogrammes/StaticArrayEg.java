package com.SeleniumProject.javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) {
		
		int[] x = {10000, 20000, 30000, 40000, 100000, 60000, 70000, 80000};
		
		System.out.println(x.length);
		
		System.out.println(x[2]);
		
		for (int data : x)
		{
			System.out.println(data);
		}
	}

}
