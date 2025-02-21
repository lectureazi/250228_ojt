package com.mc.ojt.designpattern.b_templatemethod;

public class Player extends AbstractCharacter{

	public Player(String name, int hp, int atk, int def) {
		super(name, hp, atk, def);
	}

	@Override
	protected int calAttakWeight(int damage) {
		return (int) (damage * 1.1);
	}

	@Override
	protected int calDefenseWeight(int damage) {
		return (int) (damage * 0.9);
	}

}
