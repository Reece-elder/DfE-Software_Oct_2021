package com.qa.main;

public class Operators {
	
	// Operators are functions you can use to change numerical values 
	// Add 		+
	// Sub 		- 
	// Multiply * 
	// Divide 	/
	// Modulus  %
	
	// Modulus when dividing the values what is the remainder
	
//	15 / 4 = 3.75
//	15 / 4 = 3 remainder 3 
//  15 / 4 = 3
//	15 % 4 = 3
	
	// Modulus can be used to see if a number is odd or even
	// any Number % 2 = 0 (even) 
	
	public static int addMethod() {
		
		int result = 5 + 5;
		return result;
	}
	
	public static float divideMethod() {
		float result = 10.0f / 3.0f;
		return result;
	}
	
	// This method will take in two numbers, add them and return the result
	public static int addNums(int num1, int num2) {
		// int result = 5 + 5;
		int result = num1 + num2;
		return result;
	}

}
