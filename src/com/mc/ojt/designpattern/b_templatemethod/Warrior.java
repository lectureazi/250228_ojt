package com.mc.ojt.designpattern.b_templatemethod;

public class Warrior extends Player{

	public Warrior(String name, int hp, int atk, int def) {
		super(name, hp, atk, def);
	}

	@Override
	protected int calAttakWeight(int damage) {
		System.out.println("전사의 분노가 적용되었습니다.");
		return (int) (damage * 1.3);
	}

	@Override
	protected int calDefenseWeight(int damage) {
		System.out.println("전사의 가호가 적용되었습니다.");
		return (int) (damage * 0.7);
	}
}
