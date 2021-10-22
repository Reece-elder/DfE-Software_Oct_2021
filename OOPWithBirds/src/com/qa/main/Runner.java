package com.qa.main;

import com.qa.bird.AbstractBird;
import com.qa.bird.Bird;
import com.qa.bird.Pelican;
import com.qa.flightlessBird.FlightLessBirds;

public class Runner {
	
	public static void main(String[] args) {
		
		FlightLessBirds kiwi = new FlightLessBirds("Brown", 3, false, "Forest", 12);
		kiwi.makeNoise();
		kiwi.attemptToFly();
		
		Bird newBird = new Bird("White", 22, true); // Dont want to be able to create parent objects
		
		System.out.println(kiwi.getFeatherColour());
		System.out.println(kiwi);
		
		Pelican newPelican = new Pelican();
		newPelican.noise();
		newPelican.sleep();
		
//		AbstractBird newAbstract = new AbstractBird() {
//			
//			@Override
//			public void noise() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
	}

}
