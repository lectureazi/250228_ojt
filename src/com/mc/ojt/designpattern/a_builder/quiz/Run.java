package com.mc.ojt.designpattern.a_builder.quiz;

import java.time.LocalDate;

public class Run {

	public static void main(String[] args) {

		Calculator calculator = new Calculator(10);
		int res = calculator.plus(100).plus(50).plus(50).minus(100).calculate();
		System.out.println(res);
		
		LocalDate nowDate = LocalDate.now();
		LocalDate afterDate = nowDate.plusMonths(1).plusDays(17).plusWeeks(3);
		System.out.println(nowDate);
		System.out.println(afterDate);
		
	}

}
