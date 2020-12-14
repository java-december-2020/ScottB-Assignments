package com.codingdojo.objectmasterone;

public class Wizard extends Human {
	private int intelligence = 8;
	private int health = 50;
	
	//heals whoever cast on by wizards intelligence
	public void heal(Human healHuman) {
		System.out.println("Health before healing: " + healHuman.getHealth());
		healHuman.setHealth(this.intelligence + healHuman.getHealth());
		System.out.println("Health after healing: " + healHuman.getHealth());
	}
	
	//decreases health of whoever attacked it my 3* wizards intelligence
	public void fireball(Human castFireball) {
		System.out.println("Health before fireball: " + castFireball.getHealth());
		castFireball.setHealth(this.intelligence * 3);
		System.out.println("Health after fireball: " + castFireball.getHealth());
	}
}
