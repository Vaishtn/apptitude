package com.xworkz.aptitudeStarPatterns.generalApptitude;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter number of values you want");
		//int number = scanner.nextInt();
		int numbers[] = {3,2,6,9,42,47,27,29,16,42,50,100};
		System.out.println("Enter the values");
		

		System.out.println("enter the value that you want to search");
		int searchNumber = scanner.nextInt();

		BinarySearch binarySearch = new BinarySearch();
		boolean result = binarySearch.toSearch(searchNumber, numbers);
		if (result) {
			System.out.println("value found");
		} else {
			System.out.println("value not found");
		}
	}
	
	private boolean toSearch(int searchNumber, int[] numbers) {
		Arrays.sort(numbers);
		int lower = 0;
		int upper = numbers.length - 1;
		while(lower <= upper) {
			//System.out.println("hello");
			int mid = (lower + upper) / 2;
			if ( searchNumber > numbers[mid] ) {
				lower=mid;
			} else if ( searchNumber < numbers[mid] ) {
				upper=mid-1;
			} else if (numbers[mid] == searchNumber) {
				return true;
			}
		}
		return false;

	}

}
