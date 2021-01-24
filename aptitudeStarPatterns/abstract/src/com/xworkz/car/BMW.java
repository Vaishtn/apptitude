package com.xworkz.car;

public class BMW  extends Car{

	@Override
	int prize() {
	System.out.println("Its to costly");
		return 850000;
	}

	@Override
	String Model() {
		System.out.println("BMW"); 
		return null;
	}
	

}
