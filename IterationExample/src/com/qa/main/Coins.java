package com.qa.main;

public class Coins {
	
	public static void changeMethod(float price, float amountPaid) {
		
		float change = amountPaid - price;
		
		int twenty = 0;
		int tenner = 0;
		int fiver = 0;
		int twoPound = 0;
		int onePound = 0;
		
		// While the amount of change is greater than 20 (our first currency value)
		while(change >= 20) {
			change -= 20;
			twenty++;
		}
		
		while(change >= 10) {
			change -= 10;
			tenner++;
		}
		
		while(change >= 5) {
			change -= 5;
			fiver++;
		}
		
		while(change >= 2) {
			change -= 2;
			twoPound++;
		}
		
		while(change >= 1) {
			change -= 1;
			onePound++;
		}
		
		System.out.println("Number of Twenty Pound notes " + twenty);
		System.out.println("Number of Ten Pound notes " + tenner);
		System.out.println("Number of Fiver Pound notes " + fiver);
		System.out.println("Number of Two Pound notes " + twoPound);
		System.out.println("Number of One Pound notes " + onePound);
		
	}
	
	// Create a method to print the numbers 1 to 10 as many times as the value of that number.
	// For example; you will print 1 once, and 10 ten times.
	
	public static void flowChartDemo() {
		
		for (int i = 1; i < 10; i++) {
			
			for (int y = 1; y <= i; y++) {
				System.out.print("value of y is " + i);
			}
			System.out.println("");
		}
	}

}
