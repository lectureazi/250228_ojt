package com.mc.ojt.designpattern.c_strategy;

import java.util.Random;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Character warrior = new Character("강사", 200, 10, 10);
		Character monster = new Character("고블린", 200, 10, 10);
		
		Weapon[] weapons = new Weapon[] {new Sword("목검", 5)
					, new Sword("철검", 10)
					, new Sword("엑스칼리버", 100)
					, new Shield("나무방패", 3)};
		
		warrior.equpidWeapon(weapons[0]);
		monster.equpidWeapon(weapons[3]);
		
		System.out.println("전투 시작!");
		
		while(true) {
			if(warrior.isDead()) {
				System.out.println("졌습니다.");
				break;
			}
			
			if(monster.isDead()) {
				System.out.println("이겼습니다.");
				break;
			}
			
			System.out.println("============================");
			scanner.nextLine();
			
			warrior.attack(monster);
			monster.attack(warrior);
			
			System.out.println(warrior.getName() + " 남은 체력 : " + warrior.getCurrentHp());
			System.out.println(monster.getName() + " 남은 체력 : " + monster.getCurrentHp());
			
			// 런타임 시점에도 전략을 바꿀 수 있다.
			Random random = new Random();
			int idx = random.nextInt(0, 4);
			warrior.equpidWeapon(weapons[idx]);
		}

	}

}
