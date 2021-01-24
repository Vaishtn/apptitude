package com.xworkz.aptitudeStarPatterns;

public class Syntex {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				arr1[i][j] = 1;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}

	}

}
