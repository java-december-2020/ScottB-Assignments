package com.codingdojo.objectmasterone;

public class Samurai extends Human {
	private int health = 200;
	private static int samCount = 0;
	
	//attach object and decreases health to 0
	//halve the Samurai's health
	public void deathBlow(Human death) {
		System.out.println("Health before death blow: " + death.getHealth());
		death.setHealth(0);
		System.out.println("Health after death blow: " + death.getHealth());
		this.health = health / 2;
		System.out.println("Samurai health after death blow: " + this.getHealth());
	}
	
	//heal samuari to full health
	public void meditate() {
		System.out.println("Samurai health before meditate: " + this.getHealth());
		this.setHealth(this.health + (this.getHealth()/2));
		System.out.println("Samurai health after mediate: " + this.getHealth());
		
	}
	
	//returns the current number of Samurai
	public int howMany() {
		Samurai.samCount += 1;
		
		System.out.println("Current Number of Samurai: " + Samurai.samCount );
		return(Samurai.samCount);
	}
}
