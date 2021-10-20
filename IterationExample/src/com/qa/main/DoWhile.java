package com.qa.main;

public class DoWhile {
	
	public static void basicExample() {
		
		boolean testBool = true;
		
		System.out.println("Before Loop");
		// While testBool is false testbool == false
		while(!testBool) {
			System.out.println("Will this ever print??");
		}
		
		System.out.println("After Loop");
		
		// Do While - Will always run Once before checking the code
		
		// do first with no condition, and a method body
		// followed by our while (with a condition)
		do {
			System.out.println("printed from the do while loop");
		} while(!testBool);
		
//		Task - Make a new method, using the code from the previous loop
//		converting it to a do while loop
//		- attempt to start with a low total than the minimum value across both loops
		
	}

}
