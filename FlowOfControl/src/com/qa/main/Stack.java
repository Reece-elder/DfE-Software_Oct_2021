package com.qa.main;

public class Stack {
	
	public static void firstMethod() {
		System.out.println("called first");
		secondLayer();
		System.out.println("called second");
	}
	

	public static void secondMethod() {
		System.out.println("second method");
	}
	
	public static void secondLayer() {
		System.out.println("Im being called by first Method");
	}

}
