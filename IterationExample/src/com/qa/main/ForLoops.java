package com.qa.main;

public class ForLoops {
	
	// For loops primarily work with numerical values
	// They will run for a set number of times, based on how they've been configures
	
	// For loops have four components to configure
	// Initialisation (initial value)
	// Condition (What we're checking for)
	// Iterator (How we loop through the code)
	// Body (What code are we looping)
	
	public static void countToTen() {
		// count to 10, printing out each number between
		
		
		for(
				int i = 0; // initialisation - Starting from the value 0
				i < 10;    // Condition - Do this code while i is less than 10
				i++		   // Iterator - we're adding 1 to i after every loop
				) {
			System.out.println(i + 1);	// Body - What code we're wanting it to do
		}
		
		
	}
	
	public static void countDownFromTen() {
		
		for(int i = 10; i >= 0; i--) {
			System.out.println("The value of i is " + i);
		}
		
	}
	
	public static void countInFours() {
		
		for(int i = 150; i > 123; i+=4) {
			System.out.println("Value of i is " + i);
		}
		
	}
	
	public static void countWithParams(int x, int y, int z) {
		
		for(int i = x; i > y; i+=z) {
			System.out.println("Value of i is " + i);
		}
		
	}

}
