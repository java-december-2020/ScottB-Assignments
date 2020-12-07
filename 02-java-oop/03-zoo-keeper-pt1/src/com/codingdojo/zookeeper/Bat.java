package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	public void fly() {
		System.out.println("Flap, Flap Flap");
		this.energyLevel -= 50;
	}

	public void eatHumans() {
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("Town on Fire");
		this.energyLevel -= 100;
	}
	
}
