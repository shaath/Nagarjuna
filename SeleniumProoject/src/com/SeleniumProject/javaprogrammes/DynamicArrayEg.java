package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		Object[] x = new Object[5];
		
		System.out.println(x.length);

		x[0] = "Selenium";
		x[3] = 70000;
		x[0] = "UFT";
		
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}
	}

}
