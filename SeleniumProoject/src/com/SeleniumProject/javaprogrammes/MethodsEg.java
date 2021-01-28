package com.SeleniumProject.javaprogrammes;

public class MethodsEg {

	public static void main(String[] args) {
		
		function1();
		String res = function2();
		System.out.println(res);
		
		MethodsEg m = new MethodsEg();
		
		m.function3();
		boolean flag = m.function4();
		System.out.println(flag);
		int val = m.sum(60 , 40);
		System.out.println(val);
	}
	
	//static method without returning any value
	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	
	//Static method with returning value
	public static String function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
	}
	
	//Non static method without returning any value
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	//Non static method with returning value
	public boolean function4()
	{
		System.out.println("This is function4 code");
		return true;
	}
	
	public int sum(int a, int b)
	{
		int c = a + b;
		return c;
	}
	
	public double sum(double a, double b, double c)
	{
		double d = a+ b+ c;
		return d;
	}
	
	public String sum(String a, String b)
	{
		return a + b;
	}
}
