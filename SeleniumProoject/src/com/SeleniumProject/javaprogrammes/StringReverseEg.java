package com.SeleniumProject.javaprogrammes;

public class StringReverseEg {

	public static void main(String[] args) {
		
		String course = "madam";  //muineleS
		String rev = "";
		
		int len = course.length();
		
		for (int i = len-1; i >= 0; i--) 
		{
//			System.out.print(course.charAt(i));
			rev = rev + course.charAt(i);
		}
		System.out.println(rev);

		if (course.equalsIgnoreCase(rev)) {
			System.out.println("Given string is a palindrome");
		}
		else{
			System.out.println("Given string is not a palindrome");
		}
		
	}

}
