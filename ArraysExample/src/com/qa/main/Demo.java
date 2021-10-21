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
		
		
		System.out.println(colour);
		System.out.println("=======================");
		System.out.println(colourList);
		System.out.println(colourList[1]);
		
		// For loop to access our colours
		// Accessing the length of our array with .length
		
		for(int i = 0; i < colourList.length; i++) {
			
			if(i == 2) {
				break; // Stop the loop and go to the next command
			}
			
			System.out.print(colourList[i] + " ");
			// run data in a different method
			// push the data to a different class
		}
		
		
		// How to manipulate our values 
		// colourList[1] = "Purple
		
		colourList[1] = "Moave";
		System.out.println(colourList[1]);
		System.out.println();
		System.out.println(colourList[1]);
		
		
		// printing out an array without using a for loop
		String stringArrayPrint = Arrays.toString(colourList);
		
		System.out.println(stringArrayPrint);
		
		
	}
	
	public static String[] colourList = {"Blue", "Purple", "Teal", "Yellow"}; 
	
	public static void forEachLoop() {
		
		// For each String in the array ColourList
		// create a temp variable called colour that is equal to it
		for(String newColour : colourList) {
			System.out.println(newColour);
		}
		
	}
	
	public static void exerciseLoop() {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int[] newNums = {0,0,0,0,0,0,0,0,0,0};
		
		for(int num : numbers) {
			
//			System.out.println(numbers[i] * i);
//			int num = numbers[i];
//			System.out.println(num * i);
			
			System.out.println(num * 2);
			System.out.println("====================");
			System.out.println(num * num);
		}
		
		for(int i = 0; i < numbers.length; i++) {
			
			int squaredValue = numbers[i] * i;
			newNums[i] = squaredValue; // Setting the squared value on 2nd array
			
			int reverseNum = i + 1;
			newNums[newNums.length - reverseNum] = squaredValue;
			
		}
		
	}

}
