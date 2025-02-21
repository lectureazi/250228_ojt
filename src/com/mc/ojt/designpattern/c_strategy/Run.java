package com.mc.ojt.designpattern.c_strategy;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Player warrior = new Player("강사", 200, 10, 10);
		Monster monster = new Monster("고블린", 200, 10, 10);
		
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
			
			System.out.println(warrior.getName() + "남은 체력 : " + warrior.getCurrentHp());
			System.out.println(monster.getName() + "남은 체력 : " + monster.getCurrentHp());
		}

	}

}
