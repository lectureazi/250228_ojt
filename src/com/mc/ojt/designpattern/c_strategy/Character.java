package com.mc.ojt.designpattern.c_strategy;

import java.util.Random;

public class Character{
	
	private String name;
	private int hp;
	private int currentHp;
	private int atk;
	private int def;
	private Weapon weapon;
	private Armor armor;
	
	public Character(String name, int hp, int atk, int def) {
		super();
		this.name = name;
		this.hp = hp;
		this.currentHp = hp;
		this.atk = atk;
		this.def = def;
	}

	public void attack(Character target) {
		if(weapon == null) {
			System.out.println("무기를 착용하지 않았습니다.");
			return;
		}
		weapon.attack();
		
		Random random = new Random();
		int damage = random.nextInt(atk/2, atk*2);
		damage = weapon.calAttakWeight(damage);
		target.takeDamage(damage);
	}

	public void takeDamage(int damage) {
		if(armor == null) {
			applyDamage(damage);
			return;
		}
		
		damage = armor.calDefenceWeight(damage);
		damage = damage < 0 ? 0 : damage;
		applyDamage(damage);
	}
	
	public void equpidWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void equpidArmor(Armor armor) {
		this.armor = armor;
	}

	private void applyDamage(int damage) {
		this.currentHp -= damage;
		this.currentHp = currentHp < 0 ? 0 : currentHp;
	}

	public boolean isDead() {
		return currentHp == 0;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getCurrentHp() {
		return currentHp;
	}

	public int getAtk() {
		return atk;
	}

	public int getDef() {
		return def;
	}
	
	
	
	
	
	
	

}
