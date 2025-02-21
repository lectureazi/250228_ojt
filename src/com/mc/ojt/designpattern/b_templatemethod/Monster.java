package com.mc.ojt.designpattern.b_templatemethod;

public class Monster extends AbstractCharacter{

	public Monster(String name, int hp, int atk, int def) {
		super(name, hp, atk, def);
	}

	@Override
	protected int calAttakWeight(int damage) {
		return damage;
	}

	@Override
	protected int calDefenseWeight(int damage) {
		return damage;
	}

	
}
