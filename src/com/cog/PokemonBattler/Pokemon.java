package com.cog.PokemonBattler;

import java.util.ArrayList;

public class Pokemon {
	private String name;
	private int hp;
	private int attack;
	private String sound;
	private String move;
	private String type;
	
	private static ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();
	
	Pokemon(String name, int hp, int attack, String sound, String move, String type) {
		this.setName(name);
		this.setHp(hp);
		this.setAttack(attack);
		this.setSound(sound);
		this.setMove(move);
		this.setType(type);
	}
	
	public String talk() {
		return this.sound;
	}
	
	public String useMoves() {
		return this.move;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;	
	}

	public String getMove() {
		return move;
	}
	
	public void setMove(String move) {
		this.move = move;		
	}

	public String getSound() {
		return sound;
	}
	
	public void setSound(String sound) {
		this.sound = sound;	
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
