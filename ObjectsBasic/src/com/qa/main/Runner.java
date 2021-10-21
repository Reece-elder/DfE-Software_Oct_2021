package com.qa.main;

import com.qa.cake.CakeTin;
import com.qa.penguin.Penguin;
import com.qa.user.User;

public class Runner {
	
	public static void main(String[] args) {
		
		// CakeTin is the data type 
		// gfSpongeCake is the name of the object
		// Equal to new CakeTin (The method we're using)
//		CakeTin gfSpongeCake = new CakeTin();
//		System.out.println(gfSpongeCake.flavour);
//		gfSpongeCake.eatCake();
//		System.out.println(gfSpongeCake);
		CakeTin spongeCake = new CakeTin("Vanilla", 12, false, "Pink");
		CakeTin caterPillarCake = new CakeTin("Chocolate", 8, false, "Brown");
		spongeCake.eatCake();
		caterPillarCake.eatCake();
		
		spongeCake.numberOfBakedCakes();
		CakeTin.numberOfBakedCakes();
		
//		CakeTin.eatCake(); // Cant run an instanced method from a class
		
		User user1 = new User("Reece.elder@gmail.com");
		User user2 = new User("reece", "elder","gmail.com",26);
	
		Penguin penguin1 = new Penguin("Paulie", true, "Noot noot", false);
		System.out.println(penguin1.isEatenFish());
		penguin1.setName("Pingu");
		System.out.println(penguin1.getName());
	}
	
	// Static methods belong to classes 
	// non static belong to objects

}
