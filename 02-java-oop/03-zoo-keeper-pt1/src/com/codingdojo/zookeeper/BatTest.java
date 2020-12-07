package com.codingdojo.zookeeper;

public class BatTest {
	public static void main(String[] args) {
		Bat b = new Bat();
		b.energyLevel = 300;
		
		b.attackTown();
		b.attackTown();
		b.attackTown();
		b.eatHumans();
		b.eatHumans();
		b.fly();
		b.fly();
		b.displayEnergy();
	}
}
