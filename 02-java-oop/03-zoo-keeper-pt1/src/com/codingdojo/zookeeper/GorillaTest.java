package com.codingdojo.zookeeper;

public class GorillaTest {
	public static void main(String[] args) {
		Mammal m = new Mammal();
		Gorilla g = new Gorilla();
		
		int energyLevel = m.displayEnergy();
		g.throwSomething();
		g.throwSomething();
		g.throwSomething();
		g.eatBananas();
		g.eatBananas();
		g.climb();
		System.out.println("Current Energy: " + g.displayEnergy());
	}
}
