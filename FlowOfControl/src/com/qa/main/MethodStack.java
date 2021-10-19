package com.qa.main;

import java.util.Random;

public class MethodStack {
	
	// This method will return a number to main
	public static int firstLayer() {
		System.out.println("first layer called");
		int result = secondLayer();
		
		// run secondlayer again, add the value to it again
		result = result + secondLayer();
		System.out.println("first layer finished");
		return result;
		
	}
	
	// This method will provide a random number for firstLayer to use
	public static int secondLayer() {
		System.out.println("second layer called");
		
		// new Random().nextInt() will return a random number from 0 to max (-1)
		// import java.util.Random;
		int result = new Random().nextInt(8);
		System.out.println("second layer finished");
		return result;
		
	}

}
