package com.qa.main;

public class Returns {
	
	// Methods run blocks of repeatable code
	// Methods run the code until either
		// The body ends 
		// The method RETURNS something
	
	// 
	
	public static void printHello() {
		System.out.println("Hello");
	}
	
	// void = returns nothing
	// Java is explicitly data typed, meaning you have to define what data it returns
	public static String returnHello() {
		return "Hello There";
	}
	
	
	public static int returnNum() {
		return 123;
//		System.out.println("This will never print");
	}
	
	
	public static String classString = "testString";

}
