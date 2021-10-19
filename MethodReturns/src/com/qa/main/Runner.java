package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		
//		Returns.printHello();
		String returnString = Returns.returnHello();

		String newString = "Hello There";
		
		System.out.println(Returns.returnHello());
		System.out.println(Returns.classString);
		
		System.out.println(Returns.returnNum());
	}

}
