package com.mc.ojt.designpattern.proxy;

public class DeveloperProxy implements Developer {

	private Developer developer;

	public DeveloperProxy(Developer developer) {
		super();
		this.developer = developer;
	}

	@Override
	public void develop() {
		
		System.out.println("출근 카드를 찍는다. (log 찍기, 공통 전처리)");
		
		try {
			
			developer.develop();
			
		} catch (Exception e) {
			System.out.println("앗 쉬는 날이었다! (예외처리)");
		} finally {
			System.out.println("집에 간다.");
		}

	}

}
