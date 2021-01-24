package com.xworkz.aptitudeStarPatterns.singletonpattern;

public enum EnumInitSingleton {
       INSTANCE;
	
	private EnumInitSingleton() {
		System.out.println("invoking "+this.getClass().getSimpleName());
	}
}
