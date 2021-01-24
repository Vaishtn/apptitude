package com.xworkz.aptitudeStarPatterns.alphabets;

public class A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num / 2; j++) {
				if ((j == 0 || j == num / 2) && i != 0 || i == 0 && j != 0 && j != num / 2 || i == num / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
