package com.qa.main;

import com.qa.dice.DiceRoller;

public class Runner {
	
	// main method is what runs
	// dont write code in main, link to methods
	public static void main(String[] args) {
		
//		// Tell my main method to run newMethod
//		// type in the name of the method to run + () + ;
//		newMethod();
//		helloDeacon();
//		
//		// Code runs FROM main, top to bottom
//		System.out.println("3");
//		System.out.println("2");
//		System.out.println("1");
		
		// Reference the class . the method
//		Demo.imFirst();
//		Demo.imSecond();
//		Stack.firstMethod();
//		Stack.secondMethod();
//		System.out.println("main started");
//		System.out.println(MethodStack.firstLayer());
//		System.out.println("main ended");
		
		System.out.println(DiceRoller.sixSidedDice());
		
	}
	
	// make a new method called helloDeacon
	
	public static void helloDeacon() {
		System.out.println("Hello Deacon!");
	}
	
	// New method
	// All methods SHOULD be public static void (but this will change)
	public static void newMethod() {
		// method body - what runs when we say 'Run this method'
		System.out.println("Hello World!");
		
	}
	

	
	

}
