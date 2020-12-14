package com.codingdojo.objectmasterone;

public class HumanControl {
	public static void main(String[] args) {
		Human firstHuman = new Human();
		Human attackHuman = new Human();
		Wizard wiz = new Wizard();
		Ninja nin = new Ninja();
		Samurai sam = new Samurai();
		
		firstHuman.attack(attackHuman);
		wiz.heal(attackHuman);
		wiz.fireball(attackHuman);
		nin.steal(attackHuman);
		nin.runAway(attackHuman);
		sam.deathBlow(attackHuman);
		sam.meditate();
		sam.howMany();
		
		Samurai samTwo = new Samurai();
		samTwo.howMany();
	}
}
