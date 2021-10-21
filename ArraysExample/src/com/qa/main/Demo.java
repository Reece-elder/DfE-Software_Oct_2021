package com.qa.main;

import java.util.Arrays;

public class Demo {
	
	// Arrays within Java are collections of data
	// Arrays can only contain one data type Strings, ints, booleans, objects 
	// Arrays are immutable - can't be changed once they're created
	// You can change the VALUES but can't change the data type OR the length 
	
	// Arrays in Java = Train, you can change the customers getting on and off
	// but you can't change the length of the train or type of cargo mid journey
	
	public static void arrayDemo() {
		
		// When creating arrays you need to use [] to denote its an array
		// Curly {} brackets surrounding values, commas seperating values
		
		String colour = "Red";
		String[] colourList = {"Blue", "Purple", "Teal", "Yellow"}; 
		
		System.out.println(colour);
		System.out.println("=======================");
		System.out.println(colourList);
		System.out.println(colourList[1]);
		
		// For loop to access our colours
		// Accessing the length of our array with .length
		
		for(int i = 0; i < colourList.length; i++) {
			System.out.print(colourList[i] + " ");
			// run data in a different method
			// push the data to a different class
		}
		
		
		// How to manipulate our values 
		// colourList[1] = "Purple
		
		colourList[1] = "Moave";
		System.out.println();
		System.out.println(colourList[1]);
		
		
		// printing out an array without using a for loop
		String stringArrayPrint = Arrays.toString(colourList);
		
		System.out.println(stringArrayPrint);
		
		
	}

}
