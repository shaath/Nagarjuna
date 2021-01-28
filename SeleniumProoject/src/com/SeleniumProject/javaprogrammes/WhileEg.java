package com.SeleniumProject.javaprogrammes;

public class WhileEg {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i <= 500)
		{
			System.out.println(i);
			if (i == 200) 
			{
				break;
			}
			i++;		
		}
		
		System.out.println("***************");
		
		int j = 200;
		while(j >= 1)
		{
			System.out.println(j);
			j--;
		}

	}

}
