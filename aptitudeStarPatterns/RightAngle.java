package com.xworkz.aptitudeStarPatterns;

public class RightAngle {
	public static void main(String[] args) {
		int num = 3;

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (j <= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


}
