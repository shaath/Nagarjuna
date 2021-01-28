package com.SeleniumProject.javaprogrammes;

public class MethodsReuseEg {

	public static void main(String[] args) {
		MethodsEg m = new MethodsEg();
		
		int res = m.sum(600, 400);
		System.out.println(res);

		double flag = m.sum(20, 30, 50);
		System.out.println(flag);
		
		String x = m.sum("Selenium", "UFT");
		System.out.println(x);
	}

}
