package com.SeleniumProject.javaprogrammes;

public class DoWhileEg {

	public static void main(String[] args) {
		
		int i = 1;
		do
		{
			System.out.println(i);
			if (i == 25) {
				break;
			}
			i++;
		}
		while(i <= 50);
		
		System.out.println("***************");
		
		int j = 50;
		
		do
		{
			System.out.println(j);
			j--;
		}
		while(j >= 1);
		

	}

}
