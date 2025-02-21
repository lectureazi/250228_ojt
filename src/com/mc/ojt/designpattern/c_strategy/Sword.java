package com.mc.ojt.designpattern.c_strategy;

public class Sword implements Weapon{
	
	private String name;
	private int atkWeight;
	
	public Sword(String name, int atkWeight) {
		super();
		this.name = name;
		this.atkWeight = atkWeight;
	}

	@Override
	public int calAttakWeight(int damage) {
		return (int) (damage * (1 + atkWeight));
	}

	@Override
	public void attack() {
		System.out.println(name + "을 날카롭게 휘두릅니다!");
	}
	

}
