package com.mc.ojt.designpattern.a_builder.quiz;

public class Calculator {
	
	private int res;

	public Calculator(int res) {
		super();
		this.res = res;
	}
	
	public Calculator plus(int n) {
		res += n;
		return this;
	}
	
	public Calculator minus(int n) {
		res -= n;
		return this;
	}
	
	public int calculate() {
		return res;
	}
	
	

}
