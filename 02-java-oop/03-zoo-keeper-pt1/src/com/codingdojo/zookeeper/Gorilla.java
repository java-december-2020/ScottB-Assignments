package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	//private int energyLevel = 100;
	
	public void throwSomething(){
		System.out.println("The Gorilla Threw Something");
		energyLevel = energyLevel - 5;
		
	}
	
	public void eatBananas() {
		System.out.println("Gorilla Happy with Banana");
		energyLevel = energyLevel + 10;
	}
	
	public void climb() {
		System.out.println("The Gorilla Climed a Tree");
		energyLevel = energyLevel - 10;
	}
}

