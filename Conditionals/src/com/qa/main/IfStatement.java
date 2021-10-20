package com.qa.main;

public class IfStatement {
	
	// Conditionals are used when developers want code to have multiple outcomes
	
	// If a variable is a certain value 
	// do thing 
	// else do other thing
	
	public static void conditionalDemo() {
		
		// Java uses if else statements (like basically every programming / scripting language)
		// computing / programming is binary true / false 
		
		boolean isKettleOn = true;
		isKettleOn = false;
		
		// if is the command word
		// next to if within () is the statement
		// = - assignment 
		// == comparison (checking the value)
		if (isKettleOn == true) {
			// is the body
			// what the code does if the if statement is true
			System.out.println("I'll take milk no sugar :)"); }
//		 else if (isKettleOn == false) {
//			System.out.println("Pop the kettle on!");
//		}
		else {
			System.out.println("Pop the kettle on!");
		}
		
		boolean binsOut = true; 
		
		String dayOfTheWeek = "Tuesday";
		
		if(binsOut) {
			System.out.println("Bins are out!");
		} else {
			System.out.println("Bins were forgotten :(");
		}
		
		if(dayOfTheWeek == "Tuesday") {
			binsOut = false;
			System.out.println("It is tuesday!");
		}
	}
	
	// Conditional Operators 
	// == - equals 
	// > - greater than
	// < - less than 
	// <= - less than OR equals 
	// >= - greater than OR equals
	// || - OR 
	// && - AND
	// != - not equals
	
	// Task - Using Java IF Else create an if else stack that does the following:
	// - Prints out "Greater than" if a number is greater than 10 
	// - Prints out "Equals" if a number is equal to 10
	// - Prints out "less than" if a number is less than 10 
	

}
