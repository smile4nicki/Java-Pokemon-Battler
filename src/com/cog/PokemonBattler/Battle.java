package com.cog.PokemonBattler;

public class Battle {
	Trainer trainer1 = new Trainer("Ash", null);
	
	public String turn = "Trainer 1";
	
//	 this.strengthAttackKey = {fire: {grass: 1.25, water: 0.75, fire: 1}, 
//			 water: {fire: 1.25, grass: 0.75, water: 1}, 
//			 grass: {water: 1.25, fire: 0.75, grass: 1}};
	


public int criticalHit() {
	double randomValue = Math.random();
	if (randomValue > 0.8) {
		return 3;
	} else {
		return 1;
	}
}

public int fight() {
	
	// insert fight stuff here
	return (Integer) null;
}
}

