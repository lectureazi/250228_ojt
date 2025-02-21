package com.mc.ojt.designpattern.proxy;

public class Run {
	
	public static void main(String[] args) {
		Developer man = new DeveloperProxy(new Man()) ;
		Developer woman = new DeveloperProxy(new Woman());
		Developer children = new DeveloperProxy(new Children());
		
		man.develop();
		System.out.println("==================================");
		woman.develop();
		System.out.println("==================================");
		children.develop();
		System.out.println("==================================");
				
	}

}
