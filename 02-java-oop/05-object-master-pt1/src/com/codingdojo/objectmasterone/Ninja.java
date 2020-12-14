package com.codingdojo.objectmasterone;

public class Ninja extends Human {
	private int stealth = 10;
	
	//takes health by the attacker's stealth level
	public void steal(Human stealHuman) {
		System.out.println("Health before Ninja Stealth: " + stealHuman.getHealth());
		stealHuman.setHealth(stealHuman.getHealth() - stealth);
		this.setHealth(this.getHealth() + stealth);
		System.out.println("Health after Ninja Stealth: " + stealHuman.getHealth());
		System.out.println("Ninja health after Stealth: " + this.getHealth());
	}
	
	//decrease ninja health by 10
	public void runAway(Human run) {
		System.out.println("Health before running: " + run.getHealth());
		run.setHealth(run.getHealth() - 10);
		System.out.println("Health after running: " + run.getHealth());
	}
}
