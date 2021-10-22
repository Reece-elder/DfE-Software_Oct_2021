package com.qa.bird;

import com.qa.interfaces.Flight;
import com.qa.interfaces.LayEgg;

// To give interfaces to classes we use implements
public class Chicken extends Bird implements LayEgg, Flight  {

	@Override
	public boolean eggHatches() {
		System.out.println("Egg hatches");
		
	}

	@Override
	public void flies() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swoop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String laysEgg(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
