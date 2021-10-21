package com.qa.user;

public class User {
	
	// Fields
	public String firstName;
	public String lastName;
	public String email;
	public int age;

	
	// Constructor - Overloading 
	// Within a class you can use AS MANY constructors as you want - with different combos of fields
	
	// This constructor takes in 4 paramaters, 3 Strings and 1 int
	public User(String firstName, String lastName, String email, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}

	// This constructor only takes in firstName
	public User(String firstName) {
		super();
		this.firstName = firstName;
	}
	
//	public User(String email) {
//		super();
//		this.email = email;
//	}

	// Only contains an int
	public User(int age) {
		super();
		this.age = age;
	}
	
	
	
	
	
	

}
