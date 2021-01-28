package com.SeleniumProject.javaprogrammes;

public class ForEg {

	public static void main(String[] args) {
			//initialization ; condition ; incrementor / decrementor
//		for(int i = 1; i < 11 ; i++)
//		{
//			System.out.println("Hi");
//		}
		
		for (int i = 1; i <= 500; i++)
		{
			System.out.println(i);
			if(i == 75)
			{
				break;
			}
		}
		
		System.out.println("Decrementor loop example");
		
		for(int j = 500; j > 0 ; j--)
		{
			System.out.println(j);
			if (j == 350) 
			{
				break;
			}
		}

	}

}
