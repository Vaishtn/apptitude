package com.xworkz.aptitudeStarPatterns.singletonpattern;

public class SingleTester {

	public static void main(String[] args) {
		System.out.println(EnumInitSingleton.INSTANCE);
		//System.out.println(EagerInitSingleton.getinstance());
		//System.out.println(StaticBlockSingleton.getinstance());
		//System.out.println(LazyInitSingleton.class);
		//System.out.println(LazyInitSingleton.getlazyInitInstance());
		//System.out.println("instance 2"+LazyInitSingleton.getlazyInitInstance());
	}

}
