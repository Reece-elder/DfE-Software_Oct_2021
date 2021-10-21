package com.qa.main;

import com.qa.cake.CakeTin;

public class Runner {
	
	public static void main(String[] args) {
		
		// CakeTin is the data type 
		// gfSpongeCake is the name of the object
		// Equal to new CakeTin (The method we're using)
		CakeTin gfSpongeCake = new CakeTin();
		System.out.println(gfSpongeCake.flavour);
		gfSpongeCake.eatCake();
		
	}
	
	// Static methods belong to classes 
	// non static belong to objects

}
