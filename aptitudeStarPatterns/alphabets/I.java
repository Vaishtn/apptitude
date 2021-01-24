package com.xworkz.aptitudeStarPatterns.alphabets;

public class I {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i == 0 || i == 4 || j == 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}


}
