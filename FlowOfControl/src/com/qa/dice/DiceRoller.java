package com.qa.dice;

import java.util.Random;

public class DiceRoller {
	
	public static int sixSidedDice() {
		
		int result = new Random().nextInt(6);
		result = result + 1;
//		result ++;
		return result;
		
	}
	
	public static void rollFourDice() {
		
		int num1 = sixSidedDice();
		int num2 = sixSidedDice();
		int num3 = sixSidedDice();
		int num4 = sixSidedDice();
		
		int total;
		
		if(num1 < num2 && num1 < num3 && num1 < num4) {
			total = num2 + num3 + num4;
		} else if (num2 < num3 && num2 < num4) {
			total = num1 + num3+ num4;
		} 
		
	}

}
