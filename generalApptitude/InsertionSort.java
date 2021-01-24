package com.xworkz.aptitudeStarPatterns.generalApptitude;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of values");
		int num = scanner.nextInt();
		int[] iSort = new int[num];

		System.out.println("Enter  values");
		for (int i = 0; i < iSort.length; i++) {
			iSort[i] = scanner.nextInt();
		}

		InsertionSort insertionSort = new InsertionSort();
		int []sortedArray=insertionSort.inserstionSort(iSort);
		
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}

	public int[] inserstionSort(int[] iSort) {
		for (int i = 0; i < iSort.length; i++) {
			int compare = iSort[i];
			int j = i-1;
			while (j >=0 && compare < iSort[j]) {
				iSort[j+1]= iSort[j];
				j=j-1;
			}
			iSort[j+1]=compare;
		}
		return iSort;
	}

}
