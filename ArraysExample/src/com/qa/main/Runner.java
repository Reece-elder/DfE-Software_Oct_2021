package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
//		Demo.arrayDemo();
//		Demo.forEachLoop();
		ArrayLists.setupArray();
		ArrayLists.addPizza();
		System.out.println(ArrayLists.getPizza(1));
		ArrayLists.removePizza(1);
		ArrayLists.getPizza(1);
		ArrayLists.updatePizza(1);
		System.out.println(ArrayLists.getPizza(1));
		ArrayLists.forLoopArrayList();
	}

}
