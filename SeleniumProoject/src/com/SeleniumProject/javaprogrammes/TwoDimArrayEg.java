package com.SeleniumProject.javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) {
		
		Object[][] t = new Object[2][3];
		
		System.out.println(t.length);
		System.out.println(t[0].length);
		
		t[0][1] = "Selenium";
		t[1][2] = 70000;
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.print(t[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
