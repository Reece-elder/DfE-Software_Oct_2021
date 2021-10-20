package com.qa.main;

public class Scope {
	
	// Scope is how accessible the variables / methods / functions are
	// Global / Class Level Scope
	// Class level variables / methods are accessible everywhere in the class
	
	public static String helloWorld() {
		System.out.println(total);
		return "Hello";
	}
	
	public static String helloDemo() {
		return helloWorld();
	}
	
	public static int total = 5;
	
	// Downsides - accidentally messing up every other method, by accessing in use variable
	// Positives - saves time from having to declare the same variable everywhere
	
	// Local Scope variables 
	// Variables that are declared inside of a method, and can't be used elsewhere
	
	public static void bankAccount() {
		// local variable
		int bankNumber = 123456789;
	}
	
	public static void bigH4ck3r() {
//		System.out.println(bankNumber);

		
	}
	
	// Local variables - Assurance that you're not going to use data somewhere you shouldnt
	// - Downside, having to re write code sometimes

}
