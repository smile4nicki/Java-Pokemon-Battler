package com.cog.PokemonBattler;

import java.util.ArrayList;
import java.util.Scanner;

public class BattleZone {
public static void main(String[] args) {
	BattleZone pokewar = new BattleZone();
	
	Pokemon metapod = new Pokemon("Metapod", 80,20,"Bleep", "Sharpen", "Grass");
	Pokemon rattata = new Pokemon("Rattata", 40, 10, "Squeek", "Scratch", "Grass");
	Pokemon pikachu = new Pokemon ("Pikachu", 50, 10, "Squeal", "Scratch", "Fire");
	Pokemon bulbasaur = new Pokemon("Bulbasaur", 50, 10, "Rawr", "Razor Leaf", "Water");
	Pokemon psyduck = new Pokemon("Psyduck", 50, 0, "ZZZ", "Confusion Wave", "Water");
	Pokemon charmander = new Pokemon("Charmander", 50, 0, "Sizzle", "Singe", "Fire");
	
	System.out.println(pokewar.battle());
}

public String battle() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your name: ");
		String input = sc.nextLine();
		return battle();
}
}
