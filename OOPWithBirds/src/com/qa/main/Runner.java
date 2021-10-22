package com.qa.main;

import com.qa.bird.FlightLessBirds;

public class Runner {
	
	public static void main(String[] args) {
		
		FlightLessBirds kiwi = new FlightLessBirds("Brown", 3, false, "Forest", 12);
		kiwi.makeNoise();
		kiwi.attemptToFly();
		
		System.out.println(kiwi.getFeatherColour());
		
	}

}
