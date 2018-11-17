package com.cog.PokemonBattler;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
	private static String trainerName;
	List<Pokemon> pokeball;
	
//	private static ArrayList<Pokemon> pokeball = new ArrayList<Pokemon>();

	
	Trainer(String trainerName, List<Pokemon> newPokeball) {
		this.setTrainerName(trainerName);
		this.pokeball = newPokeball;
	}

	public static String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName2) {
		this.trainerName = trainerName;		
	}
	

    public void catch (String pokemon) {
    	//stream here where you go through the pokemon in the pokeball   	
//        this.pokeball.push(pokemon)
      System.out.println(Trainer.getTrainerName() + "caught" + pokemon);
}
}
