package com.cog.PokemonBattler;

import java.util.List;

public class Trainer {
	private String trainerName;
	List<Pokemon> pokeball;

	
	Trainer(String trainerName, List<Pokemon> newPokeball) {
		this.setTrainerName(trainerName);
		this.pokeball = newPokeball;
	}

	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName2) {
		this.trainerName = trainerName;		
	}
}
