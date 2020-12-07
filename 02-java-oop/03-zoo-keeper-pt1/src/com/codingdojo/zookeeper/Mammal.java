package com.codingdojo.zookeeper;

public class Mammal {
	protected int energyLevel = 100;
	
	public int energyLevel() {
		return(energyLevel);
	}
	
	public int displayEnergy() {
		System.out.println(energyLevel);
		return(energyLevel);
	}
	
}
