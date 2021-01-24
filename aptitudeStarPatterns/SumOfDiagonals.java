package com.xworkz.aptitudeStarPatterns;

public class SumOfDiagonals {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int primarySum = 0;
		int secondarySum = 0;
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (i == j) {
					primarySum = primarySum + arr1[i][j];
				}
				if (i + j == 2) {
					secondarySum = secondarySum + arr1[i][j];
				}
			}
		}
		System.out.println("sum of primary diagonals = " + primarySum);
		System.out.println("sum of secondary diagonals = " + secondarySum);

	}

}
