package com.mc.ojt.designpattern.c_strategy;

public class Shield implements Weapon{
	
	private String name;
	private int atkWeight;
	
	public Shield(String name, int atkWeight) {
		super();
		this.name = name;
		this.atkWeight = atkWeight;
	}

	@Override
	public int calAttakWeight(int damage) {
		return (int) (damage * (0.9 + atkWeight));
	}

	@Override
	public void attack() {
		System.out.println(name + "를 묵직하게 휘두릅니다.");
	}
}
