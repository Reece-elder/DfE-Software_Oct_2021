package com.qa.main;

public class Exercises {
	
	public static int blackJack(int house, int player) {
		
		// if house AND player are over 21
		// if either player is over 21 the other wins
		
		if(house > 21 && player > 21) {
			return 0;
		} else if (house > 21) {
			return player;
		} else if (player > 21) {
			return house;
		} // If we get here, NEITHER person are over 21 
		else if (house >= player) {
			return house;
		} else {
			return player;
		}
		
		
		
	}

}
