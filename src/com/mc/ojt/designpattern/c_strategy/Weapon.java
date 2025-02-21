package com.mc.ojt.designpattern.c_strategy;

public interface Weapon {
	int calAttakWeight(int damage);
	int calDefenceWeight(int damage);
	void attack();
}
