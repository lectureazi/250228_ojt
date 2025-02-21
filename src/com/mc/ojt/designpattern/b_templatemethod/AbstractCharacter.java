package com.mc.ojt.designpattern.b_templatemethod;

import java.util.Random;

public abstract class AbstractCharacter implements Character{
	
	private String name;
	private int hp;
	private int currentHp;
	private int atk;
	private int def;
	
	public AbstractCharacter(String name, int hp, int atk, int def) {
		super();
		this.name = name;
		this.hp = hp;
		this.currentHp = hp;
		this.atk = atk;
		this.def = def;
	}

	@Override
	public void attack(Character target) {
		Random random = new Random();
		int damage = random.nextInt(atk/2, atk*2);
		damage = calAttakWeight(damage);
		target.takeDamage(damage);
	}

	protected abstract int calAttakWeight(int damage);

	@Override
	public void takeDamage(int damage) {
		damage = calDefenseWeight(damage);
		damage = damage < 0 ? 0 : damage;
		applyDamage(damage);
	}

	private void applyDamage(int damage) {
		this.currentHp -= damage;
		this.currentHp = currentHp < 0 ? 0 : currentHp;
	}

	/***
	 * 
	 * @param damage
	 * @return 반환되는 데미지연산 결과값은 꼭 0보다 커야해요 ㅠㅠ
	 */
	protected abstract int calDefenseWeight(int damage);
	
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
