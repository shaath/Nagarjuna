package com.SeleniumProject.javaprogrammes;

public class StringEg {

	public static void main(String[] args) {
		
		String course = "Selenium";
		
		System.out.println(course.toUpperCase());
		System.out.println(course.toLowerCase());
		
		System.out.println(course.length());
		
		System.out.println(course.charAt(4));

		System.out.println(course.substring(2, 5));
		
		System.out.println(course.indexOf('n'));
		
		System.out.println(course.isEmpty());
		
		System.out.println(course.endsWith("ium"));
		
		System.out.println(course.startsWith("Sel"));
		
		System.out.println(course.contains("len"));
		
		System.out.println(course.equalsIgnoreCase("selenium"));
		
		System.out.println(course.replace("len", "xxx"));
		
		String x = "  Price  ";
		System.out.println(x.length());
		String y = x.trim();
		System.out.println(y.length());
		
		System.out.println(course.concat(y));
		
		System.out.println(course + x);
		
		System.out.println(course.join("%%%",course, x,y));
		
		
		
	}

}
