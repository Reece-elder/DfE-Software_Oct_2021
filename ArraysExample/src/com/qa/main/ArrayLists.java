package com.qa.main;

import java.util.ArrayList;

public class ArrayLists {
	
	// Ctrl Shift O - fixes all imports
	
	// Array Lists are an implementation of the collections class with Java 
	// They have inbuilt functionality to add, read, update and delete
	// And they are mutable meaning we can change the length of our array at will
	
	// to create an array list use: ArrayList<Data type> nameOfList
	// = new ArrayList<>()
	public static ArrayList<String> pizzaList = new ArrayList<>();
	
	// Array lists have inbuilt methods to manipulate
	
	public static void setupArray() {
		pizzaList.add("default pizza");
		pizzaList.add("Hawaiian Pizza");
		pizzaList.add("Ham and Mushroom");
	}
	
	public static void addPizza() {
		
		System.out.println(pizzaList);
		
		// arrayList name .add
		pizzaList.add("Pepperoni"); // Taking the arrayList and adding the string "Pepperoni"
		
		
		System.out.println(pizzaList);
	}
	
	// Using index value we can manipulate specific items
	public static String getPizza(int index) {
		return pizzaList.get(index); // Return the pizza of index index
	}
	
	public static void removePizza(int index) {
		pizzaList.remove(index); // Will remove the pizza at index index
	}
	
	public static void updatePizza(int index) {
		pizzaList.set(index, "new pizza");
	}
	
	public static void clearAllPizzas() {
		
	}
	
	public static void getAllPizzas() {
		
	}
	
	public static void forLoopArrayList() {
		// Print out all of the pizzas line by line with a loop
		
		for(String pizza : pizzaList) {
			System.out.println(pizza);
		}
	}
	
	

}
