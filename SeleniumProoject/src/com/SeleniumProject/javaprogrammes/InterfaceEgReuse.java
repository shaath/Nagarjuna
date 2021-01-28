package com.SeleniumProject.javaprogrammes;

public class InterfaceEgReuse {

	public static void main(String[] args) {
		
		InterfaceEg im1 = new InterfaceImplementsEg1();
		im1.vahicle();
		
		InterfaceEg im2 = new InterfaceimplementsEg2();
		im2.vahicle();

	}

}
