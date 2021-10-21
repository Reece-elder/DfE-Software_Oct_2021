package com.qa.cake;

public class CakeTin {
	
	// Fields - Attributes to describe the object
	
	public String flavour; 
	public int size; 
	public boolean glutenFree;
	public String colour;
	
	// Methods - Functions that the object can do
	
	public void eatCake() {
		System.out.println("Cake was delicious!");
	}
	
	// Constructor - Constructors are 'methods' to create objects from a class
	// Constructors have NO RETURN (doesnt mean void, means no return)
	
	// Constructor name MUST BE THE CLASS NAME EXACTLY
	public CakeTin() {
		flavour = "Vanilla";
		size = 12;
		glutenFree = true;
		colour = "Beige";
	}
	
	

}
